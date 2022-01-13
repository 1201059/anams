/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author 35191
 */
public class PedidoConvite {

    public Convite convite;
    public Date dataPedido;
    private int codPedidoConvite;
    private static int nrPedidosConvite = 0;

    public enum Estado {
        Processamento, Pronto
    };

    private Estado estado;
    public static final Estado ESTADO_DEFAULT = Estado.Processamento;
    
    public PedidoConvite() {
        this.setDataPedido(new Date());
        this.setConvite(new Convite());
        this.setCodPedidoConvite(nrPedidosConvite++);
        this.setEstado(ESTADO_DEFAULT);
    }

    public PedidoConvite(Convite convite, Date dataPedido, Estado estado) {
        this.setDataPedido(dataPedido);
        this.setConvite(new Convite(convite));
        this.setCodPedidoConvite(nrPedidosConvite++);
        this.setEstado(estado);
    }

    public PedidoConvite(PedidoConvite pc) {
        this.setDataPedido(pc.dataPedido);
        this.setConvite(new Convite(pc.convite));
        this.setCodPedidoConvite(pc.codPedidoConvite);
        this.setEstado(pc.estado);
    }

    public Convite getConvite() {
        return new Convite(convite);
    }

    public void setConvite(Convite convite) {
        this.convite = convite;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {

        this.dataPedido = dataPedido;
    }

    private void setCodPedidoConvite(int codigo) {
        this.codPedidoConvite = codigo;
    }

    public int getCodPedidoConvite() {
        return codPedidoConvite;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean valida() {
        return !this.dataPedido.before(this.convite.getDataConvite());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final PedidoConvite other = (PedidoConvite) obj;
        return this.convite.equals(other.convite)
                && this.dataPedido.equals(other.dataPedido)
                && this.codPedidoConvite == other.codPedidoConvite
                && this.estado.equals(other.estado);
    }

    @Override
    public String toString() {
        return "\nPedido convite: " + "\nCodigo: " + codPedidoConvite + " \n" + convite + "\nData do pedido: " + dataPedido + "\nEstado: " + estado + "\n";
    }
}
