package Controller;

import Model.Atuacao;
import Model.Artista;
import Model.Festival;
import Model.GESTFEST;
import Model.ProgramaFestival;
import java.util.HashSet;

/**
 *
 * @author grupo9
 */

public class UC09_DefinirProgramacaoFestivalController {
    private GESTFEST gestfest;
    private Festival festival;
    private ProgramaFestival programa;

    public UC09_DefinirProgramacaoFestivalController(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void consultarFestival(String fest){
        festival = gestfest.procuraFestival(fest);
        programa = new ProgramaFestival();
        programa.setFestival(festival);
        programa.setDatainicio(festival.getDatainicio());
        programa.setDatafim(festival.getDatafim());
    }

    public Artista procurarArtista(String artista){
        return gestfest.procuraArtista(artista);
    }

    public void programarFestival(HashSet<Atuacao> atuacoes){
        programa.setAtuacao(atuacoes);
    }

    public String apresentaDados(){
        return programa.toString();
    }

    public void guardarPrograma(){
        gestfest.registarPrograma(programa);
    }
}