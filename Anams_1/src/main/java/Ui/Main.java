/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import Model.GESTFEST;

/**
 *
 * @author 35191
 */
public class Main {

    public GESTFEST gestfest= new GESTFEST();
    
    public void main(String[] args) {
        try{
            MenuInicial ui = new MenuInicial(gestfest);
            ui.run();
        
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
