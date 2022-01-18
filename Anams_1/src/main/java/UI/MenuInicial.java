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
            System.out.println("4.Responsável pela bilhétiva do festival");
            System.out.println("5.Utilizador não registado");
            System.out.println("0.Sair");

            opcao = Utils.readLineFromConsole("Introduza a opção");
            if (opcao.equals("1")) {
                MenuAPG ui = new MenuAPG(gestfest);
                ui.run();
            } else if (opcao.equals("2")) {
                MenuRIF ui = new MenuRIF(gestfest);
                ui.run();
            } else if (opcao.equals("3")) {
                MenuRPF ui = new MenuRPF(gestfest);
                ui.run();
            } else if (opcao.equals("4")){
                MenuRBF ui= new MenuRBF(gestfest);
            }else if (opcao.equals("5")){
                MenuUNR ui = new MenuUNR (gestfest);
            }
        } while (!opcao.equals("0"));
    }
}
