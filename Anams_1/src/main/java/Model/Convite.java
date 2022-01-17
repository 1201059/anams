package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author grupo9
 */

public class Convite implements Comparable<Convite> {
    public enum Estado{sem_resposta, aceite, rejeitado, anulado};
    private int referencia;
    private Artista artista;
    private Festival festival;
    private Date dataConvite;
    private Estado estado;

    private static int contador = 0;
    private static final Estado ESTADO_DEFAULT = Estado.sem_resposta;
    
    public Convite(){
        this.referencia = ++contador;
        this.artista = new Artista();
        this.festival = new Festival();
        this.dataConvite = new Date();
        this.estado = ESTADO_DEFAULT;
    }

    public Convite(Convite convite) {
        this.referencia = convite.referencia;
        this.artista = convite.artista;
        this.festival = convite.festival;
        this.dataConvite = convite.dataConvite;
        this.estado = convite.estado;
    }

    public int getReferencia() {
        return referencia;
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

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }
    
    

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) { return true; }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) { return false; }
        Convite obj = (Convite) outroObjeto;
        return (this.referencia == obj.referencia
                && this.artista.equals(obj.artista)
                && this.festival.equals(obj.festival)
                && this.dataConvite.equals(obj.dataConvite)
                && this.estado.equals(obj.estado));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Convite feito ao artista: ").append(artista.getEmail()).append(" na data:").append(this.dataConvite.toString()).append("\n");
        sb.append("\nEstado: ").append(this.estado).append("\n");
        return sb.toString();
    }

    @Override
    public int compareTo(Convite convite) {
        if(this.getDataConvite().equals(convite.getDataConvite())){ return 0; }else if(this.getDataConvite().before(convite.getDataConvite())){return -1;}else{return 1;}
    }
}