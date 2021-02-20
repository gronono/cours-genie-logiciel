package nc.unc.cours.gl;

import java.util.Collection;

/**
 * En licence il faut avoir au moins 2 cours avec une note >= 10
 */
public class LicenceResultatCalculator implements ResultatCalculator {
    @Override
    public boolean isRecu(Collection<Resultat> resultats) {
        return resultats
                .stream()
                .flatMap(resultat -> resultat.getNote().stream())
                .filter(note -> note >= 10)
                .count() >= 2;
    }
}
