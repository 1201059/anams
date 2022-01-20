package Model;

import java.time.LocalDate;

/**
 *
 * @author grupo9
 */
public class Compra {

    private int referencia;
    private Festival festival;
    private TipoBilhete tipoBilhete;
    private int quantidade;
    private float desconto;
    private String email;
    private LocalDate dataCompra;
    private float custo;

    private static final float FLT_DEFAULT = 0;
    private static final int INT_DEFAULT = 0;
    private static final String STR_DEFAULT = "N.D.";

    private final int contador = 0;

    public Compra() {
        this.referencia += contador;
        this.festival = new Festival();
        this.tipoBilhete = new TipoBilhete();
        this.quantidade = INT_DEFAULT;
        this.email = STR_DEFAULT;
        this.dataCompra = LocalDate.now();
        this.custo = FLT_DEFAULT;
    }

    public Compra(Festival festival, TipoBilhete tipoBilhete, int quantidade, String nome, int NIF, String email, LocalDate dataCompra, float custo) {
        this.referencia += contador;
        this.festival = new Festival(festival);
        this.tipoBilhete = new TipoBilhete(tipoBilhete);
        this.quantidade = quantidade;
        this.email = email;
        this.dataCompra = LocalDate.now();
        this.custo = custo;
    }

    public Compra(Compra c) {
        this.referencia = c.contador;
        this.festival = c.festival;
        this.tipoBilhete = c.tipoBilhete;
        this.quantidade = c.quantidade;
        this.email = c.email;
        this.dataCompra = c.dataCompra;
        this.custo = c.custo;
    }

    public int getReferencia() {
        return referencia;
    }

    public Festival getFestival() {
        return festival;
    }

    public TipoBilhete getTipoBilhete() {
        return tipoBilhete;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public int getContador() {
        return contador;
    }

    public float getCusto() {
        return custo;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public void setTipoBilhete(TipoBilhete tipoBilhete) {
        this.tipoBilhete = tipoBilhete;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    @Override
    public String toString() {
        return "Compra{" + "referencia=" + referencia + ", festival=" + festival + ", tipoBilhete=" + tipoBilhete + ", quantidade=" + quantidade + ", desconto=" + desconto + ", email=" + email + ", dataCompra=" + dataCompra + ", custo=" + custo + ", contador=" + contador + '}';
    }

}
