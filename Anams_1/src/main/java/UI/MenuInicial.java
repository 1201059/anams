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
public class MenuInicial {

    private GESTFEST gestfest;
    private String opcao;

    public MenuInicial(GESTFEST gestfest) {
        this.gestfest = gestfest;
    }

    public void run() throws IOException {
        do {
            System.out.println("Menu Inicial");
            System.out.println("1.Administrador da Plataforma");
            System.out.println("2.Responsável pelo registo do Festival");
            System.out.println("3.Responsável pelo programação do Festival");
            System.out.println("0.Sair");

            opcao = Utils.readLineFromConsole("Introduza a opção");
            if (opcao.equals("1")) {
                MenuApg ui = new MenuApg(gestfest);
                ui.run();
            } else if (opcao.equals("2")) {
                MenuRif ui = new MenuRif(gestfest);
                ui.run();
            } else if (opcao.equals("3")) {
                MenuRpf ui = new MenuRpf(gestfest);
                ui.run();
            }
        } while (!opcao.equals("0"));
    }
}
