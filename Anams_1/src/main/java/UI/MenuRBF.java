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
            System.out.println("1.Consultar vendas de bilhetes ");
            System.out.println("2.Registar planeamento da bilhética");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza a opção");
            if (opcao.equals("1")) {
                UC13_ConsultarVendasBilhetesUI ui = new UC13_ConsultarVendasBilhetesUI(gestfest);
                ui.run();
            }else if (opcao.equals("2")){
                UC11_RegsitarPlaneamentoBilheticaUI ui = new UC11_RegsitarPlaneamentoBilheticaUI(gestfest);
                ui.run();
            }
        } while (!opcao.equals("0"));
    }
}