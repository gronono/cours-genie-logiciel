package nc.unc.cours.gl.layer.strict.dao;

import java.time.LocalDate;

public class UtilisateurEntity {

    private String login;
    private String nomComplet;
    private LocalDate dateNaissance;

    public UtilisateurEntity() {
    }

    public UtilisateurEntity(String login, String nomComplet, LocalDate dateNaissance) {
        this.login = login;
        this.nomComplet = nomComplet;
        this.dateNaissance = dateNaissance;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
}
