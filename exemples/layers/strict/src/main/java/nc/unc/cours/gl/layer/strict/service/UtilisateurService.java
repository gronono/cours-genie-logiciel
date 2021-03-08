package nc.unc.cours.gl.layer.strict.service;

import nc.unc.cours.gl.layer.strict.dao.UtilisateurDao;
import nc.unc.cours.gl.layer.strict.dao.UtilisateurEntity;

public class UtilisateurService {

    private final UtilisateurDao utilisateurDao = new UtilisateurDao();

    public Utilisateur findByLogin(String login) {
        UtilisateurEntity entity = utilisateurDao.findByLogin(login);
        if (entity == null) {
            return null;
        }
        return new Utilisateur(entity.getLogin(), entity.getNomComplet(), entity.getDateNaissance());
    }
}
