package UI;

import Controller.UC11_RegsitarPlaneamentoBilheticaController;
import Model.GESTFEST;

/**
 *
 * @author grupo9
 */

public class UC11_RegsitarPlaneamentoBilheticaUI {
    private GESTFEST gestfest;
    private UC11_RegsitarPlaneamentoBilheticaController controller;

    public UC11_RegsitarPlaneamentoBilheticaUI(GESTFEST gestfest){
        this.gestfest = gestfest;
        controller = new UC11_RegsitarPlaneamentoBilheticaController(gestfest);
    }

    public void run(){
        
    }
}