/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Controller.UC12_ComprarBilhetesController;
import Model.GESTFEST;

/**
 *
 * @author 35191
 */
class UC12_ComprarBilhetesUI {

    private GESTFEST gestfest;
    private UC12_ComprarBilhetesController controller;

    public UC12_ComprarBilhetesUI(GESTFEST gestfest) {
        this.gestfest = gestfest;
        controller = new UC12_ComprarBilhetesController(gestfest);
    }

    public void run() {

    }

}
