package Model;

import java.util.Date;

public class Atuacao {
    private int referencia;
    private Artista artista;
    private Date data;
    
    public Atuacao(){
        this.referencia=referencia;
        this.artista=artista;
        this.data=data;
    }
    
    public Atuacao(int referencia, Artista artista, Date data){
        this.referencia=referencia;
        this.artista=artista;
        this.data=data;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    
}