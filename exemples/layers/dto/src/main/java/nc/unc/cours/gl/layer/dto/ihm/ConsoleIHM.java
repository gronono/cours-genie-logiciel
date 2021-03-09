package nc.unc.cours.gl.layer.dto.ihm;

import nc.unc.cours.gl.layer.dto.dto.UtilisateurDto;
import nc.unc.cours.gl.layer.dto.service.UtilisateurService;

import java.util.Scanner;

public class ConsoleIHM {

    private final UtilisateurService utilisateurService = new UtilisateurService();

    public void run() {
        while (true) {
            System.out.println("Entrer un login:");
            Scanner in = new Scanner(System.in);
            String login = in.nextLine();
            UtilisateurDto utilisateur = utilisateurService.findByLogin(login);
            if (utilisateur == null) {
                System.out.println("Utilisateur non trouvé");
            } else {
                System.out.printf("%s a %s ans%n", utilisateur.getLogin(), utilisateur.getAge());
            }
        }
    }

}
