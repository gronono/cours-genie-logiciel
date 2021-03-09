package nc.unc.cours.gl.layer.dto.service;

import nc.unc.cours.gl.layer.dto.dao.UtilisateurDao;
import nc.unc.cours.gl.layer.dto.dto.UtilisateurDto;

public class UtilisateurService {

    private final UtilisateurDao utilisateurDao = new UtilisateurDao();

    public UtilisateurDto findByLogin(String login) {
        return utilisateurDao.findByLogin(login);
    }
}
