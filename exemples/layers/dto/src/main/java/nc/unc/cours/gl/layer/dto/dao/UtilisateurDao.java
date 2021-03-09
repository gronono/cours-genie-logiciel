package nc.unc.cours.gl.layer.dto.dao;

import nc.unc.cours.gl.layer.dto.dto.UtilisateurDto;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * DAO en mémoire. Dans la vrai vie, on utiliserait une base de données
 */
public class UtilisateurDao {

    private final Map<String, UtilisateurDto> utilisateurs = new HashMap<>();

    public UtilisateurDao() {
        utilisateurs.put("gbouchard", new UtilisateurDto("gbouchard", "Gérard Bouchard", LocalDate.of(1957, 5, 11)));
    }

    public UtilisateurDto findByLogin(String login) {
        return utilisateurs.get(login);
    }
}
