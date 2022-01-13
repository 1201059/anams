package UI;

import Model.GESTFEST;
import Utilitarios.Utils;
import java.io.IOException;

/**
 *
 * @author grupo9
 */

public class MenuRBF {
    private GESTFEST gestfest;
    private String opcao;

    public MenuRBF(GESTFEST gestfest) {
        this.gestfest = gestfest;
    }

    public void run() throws IOException {
        do {
            System.out.println("Menu RBF");
            System.out.println("1. Registo da Bilhética do Festival");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza a opção");
            if (opcao.equals("1")) {
                UC05_RegistoFestivalUI ui = new UC05_RegistoFestivalUI(gestfest);
                ui.run();
            }
        } while (!opcao.equals("0"));
    }
}