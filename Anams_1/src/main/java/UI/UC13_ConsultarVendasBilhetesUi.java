/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Controller.UC13_ConsultarVendasBilhetesController;
import Model.GESTFEST;

/**
 *
 * @author 35191
 */
public class UC13_ConsultarVendasBilhetesUI {

    private GESTFEST gestfest;
    private UC13_ConsultarVendasBilhetesController controller;

    public UC13_ConsultarVendasBilhetesUI(GESTFEST gestfest) {
        this.gestfest = gestfest;
        controller = new UC13_ConsultarVendasBilhetesController(gestfest);
    }

    public void run() {

    }
}
