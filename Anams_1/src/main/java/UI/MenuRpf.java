package UI;

import Model.GESTFEST;
import Utilitarios.Utils;
import java.io.IOException;

/**
 *
 * @author grupo9
 */

public class MenuRPF {
    private GESTFEST gestfest;
    private String opcao;

    public MenuRPF(GESTFEST gestfest) {
        this.gestfest = gestfest;
    }

    public void run() throws IOException {
        do {
            System.out.println("Menu Responsável pela programação");
            System.out.println("1.Convidar artista/bandas para um festival");
            System.out.println("2.Alterar estado do convite ao artista/banda");
            System.out.println("3.Definir programação de um festival");
            System.out.println("4.Consultar programação de um festival");
            System.out.println("0.Sair");

            opcao = Utils.readLineFromConsole("Introduza a opção");
            if (opcao.equals("1")) {
                UC07_ConvidarArtistaParaFestivalUI ui = new UC07_ConvidarArtistaParaFestivalUI(gestfest);
                ui.run();
            } else if (opcao.equals("2")) {
                UC08_AlterarEstadoConviteUI ui = new UC08_AlterarEstadoConviteUI(gestfest);
                ui.run();
            } else if (opcao.equals("3")) {
                UC09_DefinirProgramacaoFestivalUI ui = new UC09_DefinirProgramacaoFestivalUI(gestfest);
                ui.run();
            } else if (opcao.equals("4")) {
                UC10_ConsultarProgramacaoFestivalUI ui = new UC10_ConsultarProgramacaoFestivalUI(gestfest);
                ui.run();
            }
        } while (!opcao.equals("0"));
    }
}