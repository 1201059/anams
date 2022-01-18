/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Controller.UC11_RegsitarPlaneamentoBilheticaController;
import Model.GESTFEST;

/**
 *
 * @author 35191
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
