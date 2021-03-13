package nc.unc.cours.gl.paradigms.functionnal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Functionnal {
    public static void main(String[] args) {
        List<Etudiant> etudiants = Arrays.asList(
          new Etudiant("Gerard", 10f),
          new Etudiant("Bob", 9f),
          new Etudiant("Richard", 12f),
          new Etudiant("Alice", 13f),
          new Etudiant("Albert", 15f)
        );
        Etudiant minEtud = etudiants.stream()
                .reduce(etudiants.get(0), (previous, current) -> min(previous, current));
        System.out.println("Functionnal - La note la plus mauvaise est " + minEtud.getNote() + " obtenue par " + minEtud.getNom() );

//        String text = etudiants.stream()
//                .min(Comparator.comparing(Etudiant::getNote))
//                .map(e -> "Functionnal - La note la plus mauvaise est " + e.getNote() + " obtenue par " + e.getNom())
//                .orElse("Aucune note min");
//        System.out.println(text);
    }

    private static Etudiant min(Etudiant e1, Etudiant e2) {
        if (e1.getNote() < e2.getNote()) {
            return e1;
        }
        return e2;
    }
}
