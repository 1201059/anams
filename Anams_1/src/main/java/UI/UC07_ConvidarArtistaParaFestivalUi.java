/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Controller.UC07_ConvidarArtistaParaFestivalController;
import Model.GESTFEST;
import Utilitarios.Utils;
import java.util.Date;

/**
 *
 * @author 35191
 */
public class UC07_ConvidarArtistaParaFestivalUI {

    private GESTFEST gestfest;
    private UC07_ConvidarArtistaParaFestivalController controller;

    public UC07_ConvidarArtistaParaFestivalUI(GESTFEST gestfest) {
        this.gestfest = gestfest;
        controller = new UC07_ConvidarArtistaParaFestivalController(gestfest);
    }

    public void run() {
        System.out.println("\nConvidar artista para festival:");
        controller.novoPedidoConvite();
        introduzDados();

    }

    public void introduzDados() {
        System.out.println("Lista de convites: \n");
        if (controller.getListaConvite().isEmpty()) {
            System.out.println("Não existem convites para efetuar.");
        } else {
            System.out.println(controller.getListaConvite());
            int refBancaria = Utils.IntFromConsole("Introduza o artista do convite: ");
            if (controller.obterConvite(artista) != null) {
                controller.setConvite();
                Date dataPedido = Utils.readDateFromConsole("Introduza a data do pedido do convite: ");
                if (controller.setDados(dataPedido) == false) {
                    System.out.println("A data do pedido do convite é inferior à data do festival! Operação cancelada");
                } else {
                    apresentaDados();

                }
            }
        }
    }

    private void apresentaDados() {
        System.out.println("\nDados do processamento do pedido de encomenda:");
        System.out.println(controller.obterDados());

    }

}
