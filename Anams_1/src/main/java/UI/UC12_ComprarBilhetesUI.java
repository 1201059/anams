package UI;

import Controller.UC12_ComprarBilhetesController;
import Model.GESTFEST;

/**
 *
 * @author grupo9
 */

public class UC12_ComprarBilhetesUI {
    private GESTFEST gestfest;
    private UC12_ComprarBilhetesController controller;

    public UC12_ComprarBilhetesUI(GESTFEST gestfest) {
        this.gestfest = gestfest;
        controller = new UC12_ComprarBilhetesController(gestfest);
    }

    public void run() {

    }
}