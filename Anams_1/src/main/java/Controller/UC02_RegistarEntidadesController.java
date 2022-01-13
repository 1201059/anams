package Controller;

import Model.Entidade;
import Model.GESTFEST;
import java.util.HashSet;

/**
 *
 * @author grupo9
 */

public class UC02_RegistarEntidadesController {
    private GESTFEST gestfest;
    private Entidade entidade;

    public UC02_RegistarEntidadesController(GESTFEST gestfest) {
        this.gestfest = gestfest;
    }

    public void novaEntidade() {
        this.entidade = new Entidade();
    }

    public void setDesignacao(String designacao) {
        this.entidade.setDesignacao(designacao);
    }

    public HashSet<Entidade> getListaEntidades() {
        return this.gestfest.getLstEntidades();
    }

    public void registarEntidade(){
        this.gestfest.registarEntidade(this.entidade);
    }

    public String getEntidadeAsString(){
        return this.entidade.toString();
    }
    // public obter lista de tipos de entidade
}