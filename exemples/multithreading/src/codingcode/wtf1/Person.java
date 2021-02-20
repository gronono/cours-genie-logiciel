package codingcode.wtf1;

public class Person {

    private final int index;
    private Coffee coffee;

    public Person(int index) {
        this.index = index;
    }

    public void takeCofee(CoffeeMachine machine) {
        if (this.coffee != null) {
            throw new IllegalStateException("Already have a coffee");
        }
        this.coffee = machine.takeCoffee();
    }

    public boolean hasCoffee() {
        return coffee != null;
    }
}
