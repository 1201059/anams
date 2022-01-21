package Controller;

import Model.Compra;
import Model.Festival;
import Model.GESTFEST;
import java.util.ArrayList;

/**
 *
 * @author grupo9
 */

public class UC13_ConsultarVendasBilhetesController {
    private GESTFEST gestfest;
    private Festival festival;

    public UC13_ConsultarVendasBilhetesController(GESTFEST gestfest) {
        this.gestfest = gestfest;
    }

    public void consultarFestival(String festival){
        this.festival = this.gestfest.procuraFestival(festival);
    }
    
    public ArrayList<Compra> procurarVendas(){
        return this.gestfest.procurarVendas(this.festival);
    }
}