package Ui;

import Controller.UC10_ConsultarProgramacaoFestivalController;
import Model.GESTFEST;
import Utilitarios.Utils;

/**
 *
 * @author 35191
 */

public class UC10_ConsultarProgramacaoFestivalUi {
    private GESTFEST gestfest;
    private UC10_ConsultarProgramacaoFestivalController controller;
    
    public UC10_ConsultarProgramacaoFestivalUi(GESTFEST gestfest){
        this.gestfest = gestfest;
        controller = new UC10_ConsultarProgramacaoFestivalController(gestfest);
    }
    public void run(){
        System.out.println("\nConsultar programação festival:");

        controller.consultarFestival(inserirFestival());
        
        apresentarDados();
    }
    
    public String inserirFestival(){
        return Utils.readLineFromConsole("Insira o nome do festival a programar");
    }
    
    public void apresentarDados(){
        System.out.println(controller.apresentaDados());
    }
    
}