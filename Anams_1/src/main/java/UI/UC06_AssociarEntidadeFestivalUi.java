/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Controller.UC06_AssociarEntidadeFestivalController;
import Model.Entidade;
import Model.Festival;
import Model.GESTFEST;
import Utilitarios.Utils;

/**
 *
 * @author 35191
 */
public class UC06_AssociarEntidadeFestivalUi {
    private GESTFEST gestfest;
    private UC06_AssociarEntidadeFestivalController controller;
    private Festival festival;
    private Entidade entidade;

    public UC06_AssociarEntidadeFestivalUi(GESTFEST gestfest){
        this.gestfest = gestfest;
        controller = new UC06_AssociarEntidadeFestivalController(gestfest);
    }

    public void run(){
        System.out.println("\nAssociar entidade a festival:");
        controller.consultarFestival(introduzaFestival());
        controller.consultarEntidade(introduzaEntidade());

        apresentaDados();

        if(Utils.confirma("Pretende associar estas entidades a este festival? (S/N)")){
            controller.associaEntidades();
        }
    }

    public String introduzaFestival(){
        return Utils.readLineFromConsole("Insira o festival a tratar");
    }

    public String introduzaEntidade(){
        return Utils.readLineFromConsole("Insira a entidade a tratar");
    }

    public void apresentaDados(){
        System.out.println("\nFestival: ");
        System.out.println(controller.getFestivalAsString());
        System.out.println("\nEntidade: ");
        System.out.println(controller.getEntidadeAsString());
    }

}
