package UI;

import Controller.UC09_DefinirProgramacaoFestivalController;
import Model.Atuacao;
import Model.Artista;
import Model.GESTFEST;
import Utilitarios.Utils;
import java.util.HashSet;

/**
 *
 * @author 35191
 */
public class UC09_DefinirProgramacaoFestivalUi {
    private GESTFEST gestfest;
    private UC09_DefinirProgramacaoFestivalController controller;
    
    public UC09_DefinirProgramacaoFestivalUi(GESTFEST gestfest){
        this.gestfest = gestfest;
        controller = new UC09_DefinirProgramacaoFestivalController(gestfest);
    }
    
    public void run(){
        System.out.println("\nDefinir programação festival:");
        
        controller.consultarFestival(inserirFestival());
        controller.programarFestival(programarFestival());
        
        apresentarDados();
        
        if(Utils.confirma("Pretende guardar o programa? (S/N)")){
            controller.guardarPrograma();
        }
    }
    
    public String inserirFestival(){
        return Utils.readLineFromConsole("Insira o nome do festival a programar");
    }
    
    public Artista procurarArtista(){
        return controller.procurarArtista(inserirArtista());
    }

    public String inserirArtista(){
        return Utils.readLineFromConsole("Insira o nome do artista");
    }
    
    public HashSet<Atuacao> programarFestival(){
        HashSet<Atuacao> atuacoes = new HashSet<Atuacao>();
        do{
            Atuacao a = new Atuacao();
            a.setArtista(procurarArtista());
            a.setData(Utils.readDateFromConsole("Insira a data do espetaculo"));
            atuacoes.add(a);
        }while(Utils.confirma("Pretende inserir mais atuacoes?"));
        return atuacoes;
    }
    
    public void apresentarDados(){
        System.out.println(controller.apresentaDados());
    }
    
}
