package nc.unc.cours.gl;

import java.util.HashMap;
import java.util.Map;

public class Etudiant {

    // final car on ne peut pas modifier le nom
    private final String nom;

    private final Formation formationSuivie;

    // final car la variable ne peut pas être modifié
    // mais on peut quand même modifier le contenu de la Map
    private final Map<Cours, Resultat> resultats = new HashMap<>();

    public Etudiant(String nom, Formation formationSuivie) {
        this.nom = nom;
        this.formationSuivie = formationSuivie;
    }

    public String getNom() {
        return nom;
    }

    public Formation getFormationSuivie() {
        return this.formationSuivie;
    }

    public boolean isRecu() {
        return this.formationSuivie.getGrade().isRecu(resultats.values());
    }

    public void inscrire(Cours cours) {
        this.resultats.put(cours, Resultat.INCONNU);
    }

    public void saisirNote(Cours cours, float note) {
        this.resultats.put(cours, Resultat.of(note));
    }
}
