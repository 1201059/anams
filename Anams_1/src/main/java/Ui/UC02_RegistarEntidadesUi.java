/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import Controller.UC02_RegistarEntidadesController;
import Model.GESTFEST;
import Utilitarios.Utils;

/**
 *
 * @author 35191
 */
public class UC02_RegistarEntidadesUi {

    private GESTFEST gestfest;
    private UC02_RegistarEntidadesController controller;

    public UC02_RegistarEntidadesUi(GESTFEST gestfest) {
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
