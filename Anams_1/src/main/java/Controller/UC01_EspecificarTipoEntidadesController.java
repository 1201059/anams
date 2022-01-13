/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Entidade;
import Model.Festival;
import Model.GESTFEST;
import Model.TipoEntidade;
import java.util.HashSet;

/**
 *
 * @author 35191
 */
public class UC01_EspecificarTipoEntidadesController {
    private GESTFEST gestfest;
    private Festival festival;
    private TipoEntidade tipoEntidade;
    private HashSet<TipoEntidade> lstTipoEntidade;

    public UC01_EspecificarTipoEntidadesController(GESTFEST gestfest){
        gestfest = gestfest;
    }

    public void novoTipoEntidade(){
        tipoEntidade = new TipoEntidade();
    }

    public void setTipoEntidade(String tipo){
        tipoEntidade.setTipoEntidade(tipo);
    }

    public void adicionaTipoEntidade(){
        lstTipoEntidade.add(tipoEntidade);
    }

    public void inserirTipoEntidade(){
        gestfest.setLstTipoEntidade(lstTipoEntidade);
    }

    public String getEntidadesAsString(){
        StringBuffer sb = new StringBuffer();
        for(TipoEntidade e : lstTipoEntidade){
            sb.append(e.toString());
        }
        return sb.toString();
    }
}    

