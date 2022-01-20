package UI;

import Controller.UC03_EspecificarBilhetesController;
import Model.GESTFEST;
import Utilitarios.Utils;

/**
 *
 * @author grupo9
 */

public class UC03_EspecificarBilhetesUI {
    private GESTFEST gestfest;
    private UC03_EspecificarBilhetesController controller;

    public UC03_EspecificarBilhetesUI(GESTFEST gestfest){
        this.gestfest = gestfest;
        controller = new UC03_EspecificarBilhetesController(gestfest);
    }

    public void run(){
        System.out.println("\nEspecificar Bilhetes");
        do{
            controller.novoTipoBilhete();
            String tipo = introduzDados();
            controller.setTipoBilhete(tipo);
            controller.adicionaTipoBilhete();
        }while(Utils.confirma("Pretende adicionar mais tipos de Bilhetes? (S/N)"));

        apresentaDados();

        if(Utils.confirma("Deseja inserir estes tipos de Bilhete? (S/N)")){
            controller.inserirTiposBilhete();
        }
    }

    public String introduzDados(){
        return Utils.readLineFromConsole("Insira tipo de Bilhetes a inserir");
    }

    public void apresentaDados(){
        System.out.println("\nBilhetes: ");
        System.out.println(controller.getBilhetesAsString());
    }
}