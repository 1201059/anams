package UI;

import Model.GESTFEST;
import Utilitarios.Utils;
import java.io.IOException;

/**
 *
 * @author grupo9
 */

public class MenuUNR {
    private GESTFEST gestfest;
    private String opcao;

    public MenuUNR(GESTFEST gestfest) {
        this.gestfest = gestfest;
    }

    public void run() throws IOException {
        do {
            System.out.println("Menu RBF");
            System.out.println("1. Comprar bilhete");
            System.out.println("0. Sair");
            opcao = Utils.readLineFromConsole("Introduza a opção");
            if (opcao.equals("1")) {
                UC12_ComprarBilhetesUI ui = new UC12_ComprarBilhetesUI(gestfest);
                ui.run();
            }
        } while (!opcao.equals("0"));
    }
}