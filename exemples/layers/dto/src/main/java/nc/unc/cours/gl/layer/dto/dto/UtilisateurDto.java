package nc.unc.cours.gl.layer.dto.dto;

import java.time.LocalDate;
import java.time.Year;

public class UtilisateurDto {
    private String login;
    private String nomComplet;
    private LocalDate dateNaissance;

    public UtilisateurDto() {
    }

    public UtilisateurDto(String login, String nomComplet, LocalDate dateNaissance) {
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

    public int getAge() {
        return Year.now().getValue() - dateNaissance.getYear();
    }
}
