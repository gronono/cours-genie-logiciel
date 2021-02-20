package nc.unc.cours.gl;

import java.util.Optional;

/**
 * Représente un résultat d'un étudiant à un cours.
 *
 * Si le résultat est inconnu, utiliser {@link Resultat#INCONNU}.
 */
public interface Resultat {

    /**
     * Résultat inconnu.
     * Le cours n'est pas considéré comme acquis.
     */
    static final Resultat INCONNU = new Resultat() {
        @Override
        public Optional<Float> getNote() {
            return Optional.empty();
        }
    };

    static Resultat of(float note) {
        return new ResultatNoteCours(note);
    }

    /**
     * @return la note obtenue ou Optional.empty()
     */
    Optional<Float> getNote();
}
