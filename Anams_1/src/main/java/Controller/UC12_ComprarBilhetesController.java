package Controller;

import Model.Compra;
import Model.Festival;
import Model.GESTFEST;

/**
 *
 * @author grupo9
 */

public class UC12_ComprarBilhetesController {
    private GESTFEST gestfest;
    private Festival festival;
    private Compra compra;

    public UC12_ComprarBilhetesController(GESTFEST gestfest) {
        this.gestfest = gestfest;
    }
    
    public void novaCompra(){
        this.compra = new Compra();
    }
}
