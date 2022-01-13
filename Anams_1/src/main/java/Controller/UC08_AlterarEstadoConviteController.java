/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.GESTFEST;
import Model.PedidoConvite;
import Model.PedidoConvite.Estado;

/**
 *
 * @author 35191
 */
public class UC08_AlterarEstadoConviteController {
    private final GESTFEST gestfest;
    private PedidoConvite pc;
    
    public UC08_AlterarEstadoConviteController(GESTFEST gestfest) {
        this.gestfest = gestfest;
    }
    public String getListaConvite() {

        return gestfest.getListaPedidosConvite();
    }
    public PedidoConvite obterConvite(int cod) {
        this.pc = this.gestfest.obterPedidoConvite(cod);
        return pc;
    }
    public void setDados(String estado) {
        if (estado.equalsIgnoreCase(Estado.Pronto.toString())) {
            this.pc.setEstado(Estado.Pronto);
            pc.valida();
        }
    }

    public boolean valida() {
        if (this.pc.getEstado().equals(Estado.Pronto)) {
            this.gestfest.getRegistoNotificacoes().addNotificacao(new Notificacao(this.pc.convite.getArtista().getEmail(), "O convite foi aceite"));
        }
        return this.gestfest.validaPedidoConvite(this.pc);
    }
    public String obterDados() {
        return "Pedido de convite:\n" + this.pc.toString();
    }
}
