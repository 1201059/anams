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
public class MenuApg {

    private GESTFEST gestfest;
    private String opcao;

    public MenuApg(GESTFEST gestfest) {
        this.gestfest = gestfest;
    }

    public void run() throws IOException {

        do {
            System.out.println("Menu Administrador");
            System.out.println("1.Especificar tipo de entidades");
            System.out.println("2.Registar entidades");
            System.out.println("3.Especificvar bilhetes");
            System.out.println("4.Consultar informação do festival");
            System.out.println("0.Sair");

            opcao = Utils.readLineFromConsole("Introduza a opção");
            if (opcao.equals("1")) {
                UC01_EspecificarTipoEntidadesUI ui = new UC01_EspecificarTipoEntidadesUI(gestfest);
                ui.run();
            } else if (opcao.equals("2")) {
                UC02_RegistarEntidadesUI ui = new UC02_RegistarEntidadesUI(gestfest);
                ui.run();
            } else if (opcao.equals("3")) {
                UC03_EspecificarBilhetesUI ui = new UC03_EspecificarBilhetesUI(gestfest);
                ui.run();
            } else if (opcao.equals("4")) {
                UC04_ConsultarInformacaoUI ui = new UC04_ConsultarInformacaoUI(gestfest);
                ui.run();
            }
            
        }while (!opcao.equals("0"));
    }
}
