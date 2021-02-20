package nc.unc.cours.gl;

import java.util.Collection;

/**
 * En master, il faut que l'ensemble des résultats aient une note >= 12
 */
public class MasterResultatCalculator implements ResultatCalculator {

    @Override
    public boolean isRecu(Collection<Resultat> resultats) {
        return resultats.stream()
                .flatMap(resultat -> resultat.getNote().stream())
                .allMatch(note -> note >= 12);
    }
}
