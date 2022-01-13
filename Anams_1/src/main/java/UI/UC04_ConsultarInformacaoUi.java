/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Controller.UC04_ConsultarInformacaoController;
import Model.GESTFEST;
import Utilitarios.Utils;

/**
 *
 * @author 35191
 */
public class UC04_ConsultarInformacaoUI {
    private GESTFEST gestfest;
    private UC04_ConsultarInformacaoController controller;
    
    public UC04_ConsultarInformacaoUI(GESTFEST gestfest){
        this.gestfest=gestfest;
        this.controller = new UC04_ConsultarInformacaoController(gestfest);
    }
    public void run(){
        System.out.println("\nConsultar informação de um festival");

        controller.consultarFestival(introduzaDados());

        apresentaDados();
    }

    public String introduzaDados(){
        return Utils.readLineFromConsole("Introduza o nome do Festival a consultar");
    }

    public void apresentaDados(){
        System.out.println(controller.apresentarFestival());
    }    
        
    
}
