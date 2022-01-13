/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import Model.GESTFEST;
import Utilitarios.Utils;
import java.io.IOException;

/**
 *
 * @author 35191
 */
public class MenuRif {

    private GESTFEST gestfest;
    private String opcao;

    public MenuRif(GESTFEST gestfest) {
        this.gestfest = gestfest;
    }

    public void run() throws IOException {

        do {
            System.out.println("Menu RIF");
            System.out.println("1.Registo do Festival");
            System.out.println("2.Associar a entidade a um festival");
            System.out.println("3. Consultar informação de um festival");
            System.out.println("4. Consultar programação de um festival");
            System.out.println("0.Sair");

            opcao = Utils.readLineFromConsole("Introduza a opção");
            if (opcao.equals("1")) {
                UC05_RegistoFestivalUi ui = new UC05_RegistoFestivalUi(gestfest);
                ui.run();
            }
            if (opcao.equals("2")) {
                UC06_AssociarEntidadeFestivalUi ui = new UC06_AssociarEntidadeFestivalUi(gestfest);
                ui.run();
            } else if (opcao.equals("3")) {
                UC04_ConsultarInformacaoUi ui = new UC04_ConsultarInformacaoUi(gestfest);
                ui.run();
            } else if (opcao.equals("4")) {
                UC10_ConsultarProgramacaoFestivalUi ui = new UC10_ConsultarProgramacaoFestivalUi(gestfest);
                ui.run();
            }
        } while (!opcao.equals("0"));

    }
}
