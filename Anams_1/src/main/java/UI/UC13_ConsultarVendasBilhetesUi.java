package UI;

import Controller.UC13_ConsultarVendasBilhetesController;
import Model.GESTFEST;
import Utilitarios.Utils;
import java.util.ArrayList;

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
        System.out.println("Conseultar Vendas de Bilhetes do Festival");

        controller.consultarFestival(introduzFestival());

        procurarVendas();
    }

    public String introduzFestival(){
        return Utils.readLineFromConsole("Insira o nome do festival que pretende consultar as vendas");
    }
    
    public void procurarVendas(){
        if(controller.procurarVendas().equals(new ArrayList<>())){
            System.out.println("Não foram vendidos bilhetes para este festival ainda");
        }else {
            System.out.println(controller.procurarVendas().toString());
        }
    }
}