package nc.unc.cours.gl.paradigms.objet;

import java.util.Arrays;
import java.util.List;

public class Objet {
    public static void main(String[] args) {
        List<Etudiant> etudiants = Arrays.asList(
          new Etudiant("Gerard", 10f),
          new Etudiant("Bob", 9f),
          new Etudiant("Richard", 12f),
          new Etudiant("Alice", 13f),
          new Etudiant("Albert", 15f)
        );
        Etudiant minEtud = etudiants.get(0);
        for (Etudiant etudiant : etudiants) {
            minEtud = minEtud.min(etudiant);
            if (etudiant.getNote() < minEtud.getNote()) {
                minEtud = etudiant;
            }
        }
        System.out.println("Object - La note la plus mauvaise est " + minEtud.getNote() + " obtenue par " + minEtud.getNom() );
    }
}
