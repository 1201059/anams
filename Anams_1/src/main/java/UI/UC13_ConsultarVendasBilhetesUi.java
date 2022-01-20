package UI;

import Controller.UC13_ConsultarVendasBilhetesController;
import Model.GESTFEST;

/**
 *
 * @author grupo9
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