package Controller;

import Model.Compra;
import Model.DescontoFamilia;
import Model.DescontoGrupo;
import Model.Festival;
import Model.GESTFEST;
import Model.TipoBilhete;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author grupo9
 */

public class UC12_ComprarBilhetesController {
    private GESTFEST gestfest;
    private Festival festival;
    private Compra compra;

    public UC12_ComprarBilhetesController(GESTFEST gestfest) {
        this.gestfest = gestfest;
    }

    public void novaCompra(){
        this.compra = new Compra();
    }

    public void procurarFestival(String festival) {
        this.compra.setFestival(gestfest.procuraFestival(festival));
    }

    public void setTipoBilhete(int numTipo) {
        HashSet<TipoBilhete> tipos = this.gestfest.getLstTipoBilhetes();
        for(TipoBilhete tp : tipos){
            if(tp.getReferencia() == numTipo){
                this.compra.setTipoBilhete(tp);
            }
        }
    }

    public String getTipoBilhetes() {
        return gestfest.getLstTipoBilhetes().toString();
    }

    public List<LocalDate> getDatas() {
        LocalDate startdate = this.compra.getFestival().getDatainicio();
        LocalDate enddate = this.compra.getFestival().getDatafim();
        long numOfDaysBetween = startdate.until(enddate.plusDays(1), ChronoUnit.DAYS);
        List<LocalDate> datas = IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(i -> startdate.plusDays(i))
                .collect(Collectors.toList());
        return datas;
    }

    public void getBilhetesDisponiveis(){
        
    }

    public void verificaDescontos() {
        if (!verificaDescontoFamilia(this.compra.getQuantidade()).equals(0)) {
            this.compra.setDesconto(verificaDescontoFamilia(this.getQuantidade));
        } else if (!verificaDescontoGrupo(this.compra.getQuantidade()).equals(0)) {
            this.compra.setDesconto(verificaDescontoGrupo(this.bilhete.getNumBilhetes()));
        } else {
            this.compra.setDesconto(0);
        }
    }

    public float verificaDescontoFamilia(int qtd){
        return DescontoFamilia.obterDesconto(qtd);
    }

    public float verificaDescontoGrupo(int qtd){
        return DescontoGrupo.obterDesconto(qtd);
    }

    public String getCompraAsString(){
        return this.compra.toString();
    }
}