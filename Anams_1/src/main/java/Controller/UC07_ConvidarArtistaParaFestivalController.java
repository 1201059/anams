package Controller;

import Model.Artista;
import Model.Convite;
import Model.Festival;
import Model.GESTFEST;
import Model.PedidoConvite;

/**
 *
 * @author grupo9
 */

public class UC07_ConvidarArtistaParaFestivalController {
    private GESTFEST gestfest;
    private PedidoConvite pedidoConvite;
    private Convite convite;

    public UC07_ConvidarArtistaParaFestivalController(GESTFEST gestfest) {
        this.gestfest = gestfest;
    }

    public void novoPedidoConvite() {
        this.pedidoConvite =  new PedidoConvite();
    }

    public void setConvite() {
        this.pedidoConvite.setConvite(this.convite);
        this.pedidoConvite.valida();
    }

    public boolean valida() {
        return this.pedidoConvite.valida();
    }

    public void setArtista(Artista artista) {
        this.convite.setArtista(artista);
    }

    public Artista getArtista(String artista) {
        return gestfest.getArtista(artista);
    }

    public void setFestival(Festival festival) {
        this.convite.setFestival(festival);
    }

    public Festival getFestival(String festival) {
        return gestfest.procuraFestival(festival);
    }
    
    public String obterDados(){
        return this.convite.toString();
    }

    public void confirmarDados(){
        this.gestfest.registaConvite(convite);
    }
}