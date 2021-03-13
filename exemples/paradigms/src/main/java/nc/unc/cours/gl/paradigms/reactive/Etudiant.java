package nc.unc.cours.gl.paradigms.reactive;

/* package */ class Etudiant {

    private final String nom;
    private final float note;

    public Etudiant(String nom, float note) {
        this.nom = nom;
        this.note = note;
    }

    public String getNom() {
        return nom;
    }

    public float getNote() {
        return note;
    }
}
