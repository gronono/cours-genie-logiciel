package nc.unc.cours.gl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final int NB_PERSONS = 100;
    private static final int NB_MACHINES = 10;

    public static void main(String[] args) {
        time("Sequential", Main::sequential);
        time("parallel", Main::parallel);
        time("concurrency", Main::concurrency);
    }

    private static void time(String name, Runnable runnable) {
        System.out.println("-------------");
        System.out.println(name);
        long start = System.currentTimeMillis();
        runnable.run();
        long end = System.currentTimeMillis();
        System.out.println("Duration " + (end - start) + " ms");
    }

    private static void sequential() {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < NB_PERSONS; i++) {
            persons.add(new Person(i));
        }
        CoffeeMachine machine = new CoffeeMachine(0);

        for (Person person : persons) {
            person.takeCofee(machine);
        }

        boolean happy = persons.stream().allMatch(Person::hasCoffee);
        System.out.println("All Happy = " + happy);
        System.out.println("Delivered " + machine.nbDelivered());
    }

    private static void parallel() {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < NB_PERSONS; i++) {
            persons.add(new Person(i));
        }
        List<CoffeeMachine> machines = new ArrayList<>();
        for (int i = 0; i < NB_MACHINES; i++) {
            machines.add(new CoffeeMachine(i));
        }

        // Subdivision des personnes en plusieurs files. Une file par machine.
        List<List<Person>> sublists = new ArrayList<>();
        int nbPersonsByMachine = NB_PERSONS / NB_MACHINES;
        for (int i = 0; i < NB_MACHINES; i++) {
            int from = i * nbPersonsByMachine;
            int to = (i + 1) * nbPersonsByMachine;
            // System.out.println("Machine " + i + " from " + from + " to " + to);
            sublists.add(persons.subList(from, to));
        }

        // Création des threads. Un thread par machine
        List<Thread> threads = new ArrayList<>();
        for (CoffeeMachine machine : machines) {
            List<Person> sublist = sublists.get(machine.getIndex());
            threads.add(new Thread(() -> {
                for (Person person : sublist) {
                    person.takeCofee(machine);
                }
            }));
        }
        // Lancement des Threads
        for (Thread thread : threads) {
            thread.start();
        }
        // Attente que l'ensemble des threads soit fini.
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        boolean happy = persons.stream().allMatch(Person::hasCoffee);
        System.out.println("All Happy = " + happy);
        int delivered = machines.stream().mapToInt(CoffeeMachine::nbDelivered).sum();
        System.out.println("Delivered " + delivered);
    }

    private static void concurrency() {
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < NB_PERSONS; i++) {
            persons.add(new Person(i));
        }
        List<CoffeeMachine> machines = new ArrayList<>();
        for (int i = 0; i < NB_MACHINES; i++) {
            machines.add(new CoffeeMachine(i));
        }

        List<Thread> threads = new ArrayList<>();
        for (Person person : persons) {
            Thread thread = new Thread(() -> {
               while (!person.hasCoffee()) {
                   for (CoffeeMachine machine : machines) {
                       if (!machine.isBusy()) {
                           person.takeCofee(machine);
                           break;
                       }
                   }
                   try {
                       Thread.sleep(10);
                   } catch (InterruptedException e) {
                       throw new RuntimeException(e);
                   }
               }
            });
            threads.add(thread);
        }

        // Lancement des Threads
        for (Thread thread : threads) {
            thread.start();
        }
        // Attente que l'ensemble des threads soit fini.
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        boolean happy = persons.stream().allMatch(Person::hasCoffee);
        System.out.println("All Happy = " + happy);
        int delivered = machines.stream().mapToInt(CoffeeMachine::nbDelivered).sum();
        System.out.println("Delivered " + delivered);
    }
}
