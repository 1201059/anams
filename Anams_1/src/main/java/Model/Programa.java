package Model;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;

public class Programa {
    private int referencia;
    private Festival festival;
    private LocalDate datainicio;
    private LocalDate datafim;
    private HashSet<Atuacao> atuacao;

    public Programa(){
        this.referencia=referencia;
        this.festival=festival;
        this.datainicio=datainicio;
        this.datafim=datafim;
        this.atuacao=atuacao;
    }
    
    public Programa(int referencia, Festival festival, LocalDate datainicio, LocalDate datafim, HashSet<Atuacao> atuacao){
        this.referencia = referencia;
        this.festival = festival;
        this.datainicio = datainicio;
        this.datafim = datafim;
        this.atuacao = atuacao;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public LocalDate getDatainicio() {
        return datainicio;
    }

    public void setDatainicio(LocalDate datainicio) {
        this.datainicio = datainicio;
    }

    public LocalDate getDatafim() {
        return datafim;
    }

    public void setDatafim(LocalDate datafim) {
        this.datafim = datafim;
    }

    public HashSet<Atuacao> getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(HashSet<Atuacao> atuacao) {
        this.atuacao = atuacao;
    }
}