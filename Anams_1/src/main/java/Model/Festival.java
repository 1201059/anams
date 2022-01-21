package Model;

import java.time.LocalDate;
import java.util.HashSet;

/**
 *
 * @author grupo9
 */

public class Festival {
    private int referencia;
    private String designacao;
    private int edicao;
    private String localizacao;
    private LocalDate datainicio;
    private LocalDate datafim;
    private String recinto;
    private int qntdPalcos;
    private int lotacaoPalcos;
    private HashSet<Entidade> entidades;

    private static int contador = 0;

    private static final int INT_DEFAULT = 0;
    private static final String STR_DEFAULT = "";

    public Festival(){
        this.referencia = INT_DEFAULT;
        this.designacao = STR_DEFAULT;
        this.edicao = INT_DEFAULT;
        this.localizacao = STR_DEFAULT;
        this.datainicio = LocalDate.now();
        this.datafim = LocalDate.now();
        this.recinto = STR_DEFAULT;
        this.qntdPalcos = INT_DEFAULT;
        this.lotacaoPalcos = INT_DEFAULT;
        this.entidades= new HashSet <>();
    }

    public Festival(int referencia, String designacao, int edicao, String localizacao, LocalDate datainicio, LocalDate datafim, String recinto, int qntdPalcos, int lotacaoPalcos ){
        this.referencia = referencia;
        this.designacao = designacao;
        this.edicao = edicao;
        this.localizacao = localizacao;
        this.datainicio = datainicio;
        this.datafim = datafim;
        this.recinto = recinto;
        this.qntdPalcos = qntdPalcos;
        this.lotacaoPalcos = lotacaoPalcos;
        this.entidades = new HashSet <>();
    }

    public Festival (Festival fest){
        this.referencia = fest.referencia;
        this.designacao = fest.designacao;
        this.edicao = fest.edicao;
        this.localizacao = fest.localizacao;
        this.datainicio = fest.datainicio;
        this.datafim = fest.datafim;
        this.recinto = fest.recinto;
        this.qntdPalcos = fest.qntdPalcos;
        this.lotacaoPalcos = fest.lotacaoPalcos;
        this.entidades = new HashSet <>();
    }

    public String getDesignacao() {
        return designacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public LocalDate getDatainicio() {
        return datainicio;
    }

    public LocalDate getDatafim() {
        return datafim;
    }

    public String getRecinto() {
        return recinto;
    }

    public int getQntdPalcos() {
        return qntdPalcos;
    }

    public int getLotacaoPalcos() {
        return lotacaoPalcos;
    }

    public HashSet<Entidade> getEntidades() {
        return entidades;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setDatainicio(LocalDate datainicio) {
        this.datainicio = datainicio;
    }

    public void setDatafim(LocalDate datafim) {
        this.datafim = datafim;
    }

    public void setRecinto(String recinto) {
        this.recinto = recinto;
    }

    public void setQntdPalcos(int qntdPalcos) {
        this.qntdPalcos = qntdPalcos;
    }

    public void setLotacaoPalcos(int lotacaoPalcos) {
        this.lotacaoPalcos = lotacaoPalcos;
    }

    public void setEntidades(HashSet<Entidade> entidades) {
        this.entidades = entidades;
    }

    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null || getClass() != obj.getClass()) { return false; }
        final Festival other = (Festival) obj;
        return this.edicao == other.edicao
                && this.referencia== other.referencia
                && this.designacao.equals(other.designacao)
                && this.localizacao.equals(other.localizacao)
                && this.datainicio == other.datainicio       
                && this.datafim == other.datafim
                && this.recinto == other.recinto  
                && this.qntdPalcos == other.qntdPalcos  
                && this.lotacaoPalcos == other.lotacaoPalcos;  
    }

    @Override
    public String toString() {
        return "Festival{" + "referencia=" + referencia + ", designacao=" + designacao + ", edicao=" + edicao + ", localizacao=" + localizacao + ", datainicio=" + datainicio + ", datafim=" + datafim + ", recinto=" + recinto + ", qntdPalcos=" + qntdPalcos + ", lotacaoPalcos=" + lotacaoPalcos + '}';
    }
}