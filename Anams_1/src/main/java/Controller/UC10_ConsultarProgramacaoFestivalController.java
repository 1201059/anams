package Controller;

import Model.Festival;
import Model.GESTFEST;
import Model.Programa;

/**
 *
 * @author grupo9
 */

public class UC10_ConsultarProgramacaoFestivalController {
    private GESTFEST gestfest;
    private Festival festival;

    public UC10_ConsultarProgramacaoFestivalController(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void consultarFestival(String fest){
        festival = gestfest.procuraFestival(fest);
    }

    public String apresentaDados(){
        return procurarPrograma().toString();
    }

    private Programa procurarPrograma(){
        return gestfest.procurarPrograma(festival);
    }
}