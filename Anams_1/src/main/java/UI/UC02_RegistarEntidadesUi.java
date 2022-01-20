package UI;

import Controller.UC02_RegistarEntidadesController;
import Model.GESTFEST;
import Utilitarios.Utils;

/**
 *
 * @author grupo9
 */

public class UC02_RegistarEntidadesUI {
    private GESTFEST gestfest;
    private UC02_RegistarEntidadesController controller;

    public UC02_RegistarEntidadesUI(GESTFEST gestfest) {
        this.gestfest = gestfest;
        this.controller = new UC02_RegistarEntidadesController(gestfest);
    }

    public void run() {
        System.out.println("\nNova Entidade");
        controller.novaEntidade();
        controller.setDesignacao(introduzDesignacao());
        apresentaDados();
        if (Utils.confirma(" Confirma os dados da Entidade? Sim/Não")) {
            controller.registarEntidade();
            System.out.println("Entidade registada com sucesso.");
        }
    }

    private String introduzDesignacao() {
        return Utils.readLineFromConsole("Introduz a designação da entidade");
    }

    private void apresentaDados() {
        System.out.println("\nEntidade:\n" + controller.getEntidadeAsString());
    }
}