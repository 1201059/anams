package UI;

import Model.GESTFEST;

/**
 *
 * @author grupo9
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