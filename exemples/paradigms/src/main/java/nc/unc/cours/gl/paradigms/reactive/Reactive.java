package nc.unc.cours.gl.paradigms.reactive;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class Reactive {
    public static void main(String[] args) {
        List<Etudiant> etudiants = Arrays.asList(
          new Etudiant("Gerard", 10f),
          new Etudiant("Bob", 9f),
          new Etudiant("Richard", 12f),
          new Etudiant("Alice", 13f),
          new Etudiant("Albert", 15f)
        );
        
        Flux.fromIterable(etudiants)
                .reduce((previous, current) -> min(previous, current))
                .subscribe(e -> System.out.println("Functionnal - La note la plus mauvaise est " + e.getNote() + " obtenue par " + e.getNom()));
    }

    private static Etudiant min(Etudiant e1, Etudiant e2) {
        if (e1.getNote() < e2.getNote()) {
            return e1;
        }
        return e2;
    }
}
