package nc.unc.cours.gl;

public class Cours {

    // final car on ne peut pas modifier l'intitule
    private final String intitule;

    public Cours(String intitule) {
        this.intitule = intitule;
    }

    public String getIntitule() {
        return intitule;
    }
}