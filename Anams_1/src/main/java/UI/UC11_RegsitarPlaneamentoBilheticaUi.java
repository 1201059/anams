package UI;

import Controller.UC11_RegistarPlaneamentoBilheticaController;
import Model.GESTFEST;

/**
 *
 * @author grupo9
 */

public class UC11_RegsitarPlaneamentoBilheticaUI {
    private GESTFEST gestfest;
    private UC11_RegistarPlaneamentoBilheticaController controller;

    public UC11_RegsitarPlaneamentoBilheticaUI(GESTFEST gestfest){
        this.gestfest = gestfest;
        controller = new UC11_RegistarPlaneamentoBilheticaController(gestfest);
    }

    public void run(){
        
    }
}