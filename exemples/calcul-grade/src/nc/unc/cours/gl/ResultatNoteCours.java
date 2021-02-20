package nc.unc.cours.gl;

import java.util.Optional;

import static java.lang.String.format;

public class ResultatNoteCours implements Resultat {

    private final static float NOTE_MEDIANNE = 10f;

    private final float note;

    // On ne peut pas directement instancier la classe depuis un autre package.
    // Utiliser ResultatCours#of(flaot) pour créer une nouvelle instance.
    /* package */ ResultatNoteCours(float note) {
        if (note < 0 || note > 20) {
            throw new IllegalArgumentException(format("Une note (%s) doit être comprise en 0 et 20", note));
        }
        this.note = note;
    }

    @Override
    public Optional<Float> getNote() {
        return Optional.of(note);
    }
}
