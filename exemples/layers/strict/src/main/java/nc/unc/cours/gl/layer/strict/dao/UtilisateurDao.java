package nc.unc.cours.gl.layer.strict.dao;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * DAO en mémoire. Dans la vrai vie, on utiliserait une base de données
 */
public class UtilisateurDao {

    private final Map<String, UtilisateurEntity> utilisateurs = new HashMap<>();

    public UtilisateurDao() {
        utilisateurs.put("gbouchard", new UtilisateurEntity("gbouchard", "Gérard Bouchard", LocalDate.of(1957, 5, 11)));
    }

    public UtilisateurEntity findByLogin(String login) {
        return utilisateurs.get(login);
    }
}
