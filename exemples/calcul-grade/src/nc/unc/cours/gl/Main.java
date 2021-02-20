package nc.unc.cours.gl;

public class Main {

    public static void main(String[] args) {
        Formation licence = new Formation("Licence", Grade.LICENCE);
        Formation master = new Formation("Master", Grade.MASTER);

        Cours genieLogiciel = new Cours("Génie logiciel");
        Cours gestionProjets = new Cours("Gestion de projets");

        // Toto est inscrit en licence avec les notes 10 et 12
        Etudiant toto = new Etudiant("Toto", licence);
        toto.inscrire(genieLogiciel);
        toto.inscrire(gestionProjets);
        toto.saisirNote(gestionProjets, 10);
        toto.saisirNote(genieLogiciel, 12);
        // Il est recu (car algo de Licence)
        System.out.println("Toto = " + toto.isRecu());

        // Titi inscrit en master avec les mêmes notes que toto
        Etudiant titi = new Etudiant("Titi", master);
        titi.inscrire(genieLogiciel);
        titi.inscrire(gestionProjets);
        titi.saisirNote(gestionProjets, 10);
        titi.saisirNote(genieLogiciel, 12);
        // Il n'est pas recu (car algo de master)
        System.out.println("Titi = " + titi.isRecu());
    }
}
