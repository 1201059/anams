package Controller;

import Model.Convite;
import Model.GESTFEST;
import Model.PedidoConvite;
import java.util.Date;

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
}