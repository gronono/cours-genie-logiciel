package nc.unc.cours.gl;

public class Formation {

    // final car on ne peut pas modifier le nom
    private final String intitule;

    private final Grade grade;

    public Formation(String intitule, Grade grade) {
        this.intitule = intitule;
        this.grade = grade;
    }

    public String getIntitule() {
        return intitule;
    }

    public Grade getGrade() {
        return grade;
    }
}
