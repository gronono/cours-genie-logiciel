package nc.unc.cours.gl.layer.strict.service;

import java.time.LocalDate;
import java.time.Year;

public class Utilisateur {

    private final String login;
    private final String nomComplet;
    private final LocalDate dateNaissance;

    public Utilisateur(String login, String nomComplet, LocalDate dateNaissance) {
        this.login = login;
        this.nomComplet = nomComplet;
        this.dateNaissance = dateNaissance;
    }

    public String getLogin() {
        return login;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public int getAge() {
        return Year.now().getValue() - dateNaissance.getYear();
    }
}
