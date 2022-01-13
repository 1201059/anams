/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 35191
 */
public class Convite implements Comparable<Convite> {

    private List<Item> lstItens;
    private Artista artista;
    private Date dataConvite;

    public enum Estado {
        Aguardar_Pagamento, Pago, Cancelado
    };
    private Estado estado;
    public static final Estado ESTADO_DEFAULT = Estado.Aguardar_Pagamento;

    public Convite(Artista art) {
        this.lstItens = new ArrayList<>();
        this.setArtista(art);
        this.setDataConvite(new Date());
        this.setEstado(ESTADO_DEFAULT);

    }

    public Convite() {
        this.lstItens = new ArrayList<>();
        this.setArtista(new Artista());
        this.setDataConvite(new Date());
        this.setEstado(ESTADO_DEFAULT);
    }

    
    public Convite(Convite c) {
        this.lstItens = new ArrayList<>(c.lstItens);
        this.setArtista(c.artista);
        this.setDataConvite(c.dataConvite);
        this.setEstado(c.estado);
    }
    
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public Date getDataConvite() {
        return dataConvite;
    }

    public void setDataConvite(Date dataConvite) {
        this.dataConvite = dataConvite;
    }
    public Artista getArtista() {
        return artista;
    }
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    public List<Item> getLstItem() {
        return lstItens;
    }

    public void setLstItens(List<Item> lstItens) {
        this.lstItens = new ArrayList<>(lstItens);
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) {
            return false;
        }
        Convite obj = (Convite) outroObjeto;

        return (this.lstItens.equals(obj.lstItens) && this.artista.equals(obj.artista) && this.dataConvite.equals(obj.dataConvite));

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Convite feito ao artista: ").append(artista.getEmail()).append(" na data:").append(this.dataConvite.toString()).append("\n");
        for (Item i : this.lstItens) {
            sb.append(i.toString());
        }
        sb.append("\nEstado: ").append(this.estado).append("\n");

        return sb.toString();
    }
    
    public boolean validaItem(Item it) {
        return it.valida();
    }

    public void adicionaItem(Item it) {
        if (this.valida(it) == true) {
            this.addItem(it);
        }
    }
    private boolean valida(Item it) {
        for (Item i : this.lstItens) {
            if (i.equals(it)) {
                return false;
            }
        }
        return true;
    }

    private void addItem(Item it) {
        this.lstItens.add(it);
    }

    @Override
    public int compareTo(Convite convite) {
        if (this.getDataConvite().equals(convite.getDataConvite())) {
            return 0;
        } else if (this.getDataConvite().before(convite.getDataConvite())) {
            return -1;
        } else {
            return 1;
        }
    }
}

