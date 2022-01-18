/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.GESTFEST;
import Utilitarios.Utils;
import java.io.IOException;

/**
 *
 * @author 35191
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
