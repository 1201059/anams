/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Festival;
import Model.GESTFEST;
import Model.TipoBilhete;
import java.util.HashSet;

/**
 *
 * @author 35191
 */
public class UC03_EspecificarBilhetesController{
    private GESTFEST gestfest;
    private Festival festival;
    private TipoBilhete tipoBilhete;
    private HashSet<TipoBilhete> lstTipoBilhete;
    
    public UC03_EspecificarBilhetesController(GESTFEST gestfest){
        gestfest = gestfest;
    }

    public void novoTipoBilhete(){
        tipoBilhete = new TipoBilhete();
    }

    public void setTipoBilhete(String designacao){
        tipoBilhete.setTipoBilhete(designacao);
    }

    public void adicionaTipoBilhete(){
        lstTipoBilhete.add(tipoBilhete);
    }

    public void inserirTiposBilhete(){
        gestfest.setLstTipoBilhete(lstTipoBilhete);
    }
    
    public String getBilhetesAsString(){
        StringBuffer sb = new StringBuffer();
        for(TipoBilhete tb : lstTipoBilhete){
            sb.append(tb.toString());
        }
        return sb.toString();
    }
    
}
