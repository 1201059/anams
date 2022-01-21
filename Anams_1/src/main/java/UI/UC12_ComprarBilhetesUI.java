package UI;

import Controller.UC12_ComprarBilhetesController;
import Model.Compra;
import Model.GESTFEST;
import java.util.ArrayList;
import Model.GESTFEST;
import Model.TipoBilhete;
import Utilitarios.Utils;

/**
 *
 * @author grupo9
 */

public class UC12_ComprarBilhetesUI {
    private GESTFEST gestfest;
    private UC12_ComprarBilhetesController controller;
    private Compra compra;

    public UC12_ComprarBilhetesUI(GESTFEST gestfest) {
        this.gestfest = gestfest;
        controller = new UC12_ComprarBilhetesController(gestfest);
    }

    public void run() {
        System.out.println("Compra bilhetes");

        controller.novaCompra();
        controller.procurarFestival(introduzFestival());
        String tipoBilhete = controller.getTipoBilhetes();

        controller.setTipoBilhete(introduzTipoBilhete(tipoBilhete.length()));

        controller.setNumBilhetes(introduzNumBilhetes(controller.getBilhetesDisponiveis()));

        controller.verificaDesconto();

        apresentaDados();

        if (Utils.confirma("Prentende inserir este plano? (S/N)")) {

        }
    }

    private String introduzFestival() {
        return Utils.readLineFromConsole("Insira o festival a trabalhar");
    }

    private Integer introduzNumBilhetes(int lotacao, TipoBilhete tp) {
        int a = 0;
        do {
            a = Utils.IntFromConsole("Insira o número de Bilhetes disponíveis para o tipo" + tp.getTipoBilhete());
        } while (a < 0 || a > lotacao);
        return new Integer(a);
    }

    private int introduzTipoBilhete(int num) {
        int a = 0;
        do {
            a = Utils.IntFromConsole("Insira o número do tipo de Bilhete que pretende aquirir");
        } while (a < 0 || a > num);
        return a;
    }

    private int introduzNumBilhetes(int numBilhetes) {
        System.out.println("Existem " + numBilhetes + " bilhetes disponíveis do tipo selecionado");
        int a = 0;
        if (Utils.confirma("Pretende aquirir bilhetes deste tipo?")) {
            do {
                a = Utils.IntFromConsole("Insira o número de bilhetes que pretende aquirir");
            } while (a < 0 || a > numBilhetes);
        }
        return a;
    }

    private void apresentaDados(){
        System.out.println(controller.getCompraAsString());
    }
}