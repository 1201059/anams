package UI;

import Controller.UC01_EspecificarTipoEntidadesController;
import Model.GESTFEST;
import Utilitarios.Utils;

/**
 *
 * @author grupo9
 */

public class UC01_EspecificarTipoEntidadesUI {
    private GESTFEST gestfest;
    private UC01_EspecificarTipoEntidadesController controller;

    public UC01_EspecificarTipoEntidadesUI(GESTFEST gestfest){
        this.gestfest = gestfest;
        controller = new UC01_EspecificarTipoEntidadesController(gestfest);
    }

    public void run(){
        System.out.println("\nEspecificar tipos de Entidades:");
        do{
            controller.novoTipoEntidade();
            String tipo = introduzDados();
            controller.setTipoEntidade(tipo);
            controller.adicionaTipoEntidade();
        }while(Utils.confirma("Pretende adicionar mais tipos de Entidades? (S/N)"));

        apresentaDados();

        if(Utils.confirma("Pretende inserir estas entidades? (S/N)")){
            controller.inserirTipoEntidade();
        }
    }

    public String introduzDados(){
        return Utils.readLineFromConsole("Insira tipo de Entidades a inserir: ");
    }

    public void apresentaDados(){
        System.out.println("\nEntidades: ");
        System.out.println(controller.getEntidadesAsString());
    }    
}