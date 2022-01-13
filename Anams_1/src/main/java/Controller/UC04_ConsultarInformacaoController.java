package Controller;

import Model.Festival;
import Model.GESTFEST;

/**
 *
 * @author grupo9
 */

public class UC04_ConsultarInformacaoController {
    private GESTFEST gestfest;
    private Festival festival;

    public UC04_ConsultarInformacaoController(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void consultarFestival(String fest){
        festival = gestfest.procuraFestival(fest);
    }

    public String apresentarFestival(){
        return festival.toString();
    }
}