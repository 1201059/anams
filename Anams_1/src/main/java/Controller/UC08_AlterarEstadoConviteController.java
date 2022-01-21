package Controller;

import Model.Convite;
import Model.Notificacao;
import Model.Convite.Estado;
import Model.GESTFEST;
import java.util.ArrayList;

/**
 *
 * @author grupo9
 */

public class UC08_AlterarEstadoConviteController {
    private final GESTFEST gestfest;
    private Convite convite;

    public UC08_AlterarEstadoConviteController(GESTFEST gestfest) {
        this.gestfest = gestfest;
    }

    public ArrayList<Convite> getListaConvites(){
        return this.gestfest.getListaConvites();
    }

    public Convite obterConvite(int cod) {
        this.convite = this.gestfest.obterConvite(cod);
        return convite;
    }

    public void setDados(String estado) {
        if (estado.equalsIgnoreCase(Estado.sem_resposta.toString())) {
            this.convite.setEstado(Estado.sem_resposta);
            convite.validaConvite();
        }
    }

    public boolean valida() {
        if (this.convite.getEstado().equals(Estado.sem_resposta)) {
            this.gestfest.getRegistoNotificacoes().addNotificacao(new Notificacao(this.convite.getArtista().getEmail(), "O convite foi aceite"));
        }
        return this.gestfest.validaConvite(this.convite);
    }

    public String obterDados() {
        return "Convite:\n" + this.convite.toString();
    }
}