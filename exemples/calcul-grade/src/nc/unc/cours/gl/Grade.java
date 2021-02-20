package nc.unc.cours.gl;

import java.util.Collection;
import java.util.List;

public enum Grade {
    LICENCE(new LicenceResultatCalculator()),
    MASTER(new MasterResultatCalculator());

    private final ResultatCalculator resultatCalculator;

    private Grade(ResultatCalculator resultatCalculator) {
        this.resultatCalculator = resultatCalculator;
    }

    public boolean isRecu(Collection<Resultat> resultats) {
        return this.resultatCalculator.isRecu(resultats);
    }
}
