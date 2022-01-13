/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Entidade;
import Model.Festival;
import Model.GESTFEST;
import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author 35191
 */
public class UC05_RegistoFestivalController {
    private GESTFEST gestfest;
    private Festival festival;
    
    public UC05_RegistoFestivalController(GESTFEST gestfest){
        gestfest=gestfest;
    }
    public void novoFestival(){
        this.festival = new Festival();
    }
    public void setDesignacao(String designacao){
        this.festival.setDesignacao(designacao);
    }
    public void setEdicao(int edicao){
        this.festival.setEdicao(edicao);
    }
    public void setLocalizacao(String localizacao){
        this.festival.setLocalizacao(localizacao);
    }
    public void setDataFim (Date datafim){
        this.festival.setDatafim(datafim);
    }
    public void setDataInicio (Date datainicio){
        this.festival.setDatainicio(datainicio);
    }
    public void setRecinto (String recinto){
        this.festival.setRecinto(recinto);
    }
    public void setnumPalcos(int numPalcos){
        this.festival.setQntdPalcos(numPalcos);
    }
    public void setlotacaoPalcos(int lotacaoPalcos){
        this.festival.setLotacaoPalcos(lotacaoPalcos);
    }
    public void setEntidades(HashSet<Entidade> entidades){
        this.festival.setEntidades(entidades);
    }
    public HashSet<Festival> getlistaFestival(){
        return this.gestfest.getLstFestivais();
    }
    public boolean registaFestival(){
        return this.gestfest.registaFestival(this.festival);
    }
    public String getFestivalAsString(){
        return this.festival.toString();
    }
    
}
