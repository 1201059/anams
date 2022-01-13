/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Entidade;
import Model.Festival;
import Model.GESTFEST;
import java.util.HashSet;

/**
 *
 * @author 35191
 */
public class UC06_AssociarEntidadeFestivalController {
    private GESTFEST gestfest;
    private Festival festival;
    private Entidade entidade;

    public UC06_AssociarEntidadeFestivalController(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void consultarFestival(String festival) {
        this.festival = gestfest.procuraFestival(festival);
    }

    public void consultarEntidade(String entidade){
        this.entidade = gestfest.procuraEntidade(entidade);
    }

    public void associaEntidades(){
        HashSet<Entidade> entidades = this.festival.getEntidades();
        entidades.add(entidade);
        this.festival.setEntidades(entidades);
    }

    public String getFestivalAsString(){
        return this.festival.toString();
    }

    public String getEntidadeAsString(){
        return this.entidade.toString();
    }
}
