/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import Controller.UC08_AlterarEstadoConviteController;
import Model.GESTFEST;
import Utilitarios.Utils;

/**
 *
 * @author 35191
 */
public class UC08_AlterarEstadoConviteUi {

    private GESTFEST gestfest;
    private UC08_AlterarEstadoConviteController controller;

    public UC08_AlterarEstadoConviteUi(GESTFEST gestfest) {
        this.gestfest = gestfest;
        controller = new UC08_AlterarEstadoConviteController(gestfest);
    }

    public void run() {
        System.out.println("\nAlterar estado do convite:");
        System.out.println("Lista de convites: ");
        if (controller.getListaConvite().isEmpty()) {
            System.out.println("\nNão existem convites para alterar o estado.");
        } else {

            System.out.println(controller.getListaConvite());
            introduzDados();
        }
    }
    private void introduzDados() {
        int cod = Utils.IntFromConsole("Introduza o código do estado do convite: ");
        if (controller.obterConvite(cod) != null) {
            String estado = Utils.readLineFromConsole("Qual o estado do convite?\nOpções disponíveis: \n-Pronto");
            if (estado.equalsIgnoreCase("pronto")) {
                controller.setDados(estado);
                apresentaDados();
                if (Utils.confirma("Confirma o novo estado do convite? (S/N)")) {
                    if (controller.valida()) {
                        System.out.println("Estado alterado com sucesso.");
                    }else {
                        System.out.println("Estado não alterado.");
                    }
                }
            }else {
                System.out.println("Introduza um estado disponivel!");
            }
        }else {
            System.out.println("Código de pedido de encomenda inválido.");
        }
    }

    private void apresentaDados() {
        System.out.println(controller.obterDados());
    }
}

