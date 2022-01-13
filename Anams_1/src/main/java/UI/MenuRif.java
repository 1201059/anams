package UI;

import Model.GESTFEST;
import Utilitarios.Utils;
import java.io.IOException;

/**
 *
 * @author grupo9
 */

public class MenuRIF {
    private GESTFEST gestfest;
    private String opcao;

    public MenuRIF(GESTFEST gestfest) {
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
                UC05_RegistoFestivalUI ui = new UC05_RegistoFestivalUI(gestfest);
                ui.run();
            }else if (opcao.equals("2")) {
                UC06_AssociarEntidadeFestivalUI ui = new UC06_AssociarEntidadeFestivalUI(gestfest);
                ui.run();
            } else if (opcao.equals("3")) {
                UC04_ConsultarInformacaoUI ui = new UC04_ConsultarInformacaoUI(gestfest);
                ui.run();
            } else if (opcao.equals("4")) {
                UC10_ConsultarProgramacaoFestivalUI ui = new UC10_ConsultarProgramacaoFestivalUI(gestfest);
                ui.run();
            }
        } while (!opcao.equals("0"));
    }
}