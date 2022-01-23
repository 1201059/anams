package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grupo9
 */

public class Convite implements Comparable<Convite> {
    public enum Estado{sem_resposta, aceite, rejeitado, anulado};
    private int referencia;
    private Artista artista;
    private String email;
    private Festival festival;
    private LocalDate dataConvite;
    private LocalDate dataLimite;
    private Estado estado;

    private static int contador = 0;
    private static final String STRING_DEFAULT = "";
    
    public Convite(){
        this.referencia = ++contador;
        this.artista = new Artista();
        this.email= STRING_DEFAULT;
        this.festival = new Festival();
        this.dataConvite = LocalDate.now();
        this.dataLimite = LocalDate.now();
        this.estado = Estado.sem_resposta;
    }

    public Convite(Convite convite) {
        this.referencia = convite.referencia;
        this.artista = convite.artista;
        this.email= convite.email;
        this.festival = convite.festival;
        this.dataConvite = convite.dataConvite;
        this.dataLimite = convite.dataLimite;
        this.estado = convite.estado;
    }

    public int getReferencia() {
        return referencia;
    }

    public Artista getArtista() {
        return artista;
    }

    public String getEmail() {
        return email;
    }

    public Festival getFestival() {
        return festival;
    }

    public LocalDate getDataConvite() {
        return dataConvite;
    }

    public LocalDate getDatalimite() {
        return dataLimite;
    }

    public Estado getEstado() {
        return estado;
    }

    public static int getContador() {
        return contador;
    }

    public static String getSTRING_DEFAULT() {
        return STRING_DEFAULT;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public void setDataConvite(LocalDate dataConvite) {
        this.dataConvite = dataConvite;
    }

    public void setDatalimite(LocalDate datalimite) {
        this.dataLimite = datalimite;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean valida(Convite c){
        if(this.artista.equals(c.artista)
                && this.email.equalsIgnoreCase(c.email)
                && this.festival.equals(c.festival)
                && this.dataConvite.equals(c.dataConvite)
                && this.dataLimite.equals(c.dataLimite)
                && this.estado.equals(c.estado)){
            return false;
        }
        return true;
    }
    public boolean valida() {
        boolean validacao = true;
        if (this.artista.valida() == false || this.email.length() <= 0 || this.festival.valida() <= 0 || this.dataConvite.equals(LocalDate.now()) || this.dataLimite.equals(LocalDate.now()))  {
            return false;
        }
        return validacao;
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) { return true; }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) { return false; }
        Convite obj = (Convite) outroObjeto;
        return (this.referencia == obj.referencia
                && this.artista.equals(obj.artista)
                && this.email.equals(obj.email)        
                && this.festival.equals(obj.festival)
                && this.dataConvite.equals(obj.dataConvite)
                && this.estado.equals(obj.estado));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Convite feito ao artista: ");
        sb.append(artista.getEmail());
        sb.append(email);
        sb.append(" na data:");
        sb.append(this.dataConvite.toString());
        sb.append("\n");
        sb.append("\nEstado: ").append(this.estado).append("\n");
        return sb.toString();
    }

    @Override
    public int compareTo(Convite convite) {
        if(this.getDataConvite().equals(convite.getDataConvite())){ return 0; }else if(this.getDataConvite().isBefore(convite.getDataConvite())){return -1;}else{return 1;}
    }
}