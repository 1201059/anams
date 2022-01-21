package Model;

/**
 *
 * @author grupo9
 */

public class TipoBilhete {
    private int referencia;
    private String TipoBilhete;
    
    private static int contador = 0; 
    
    public TipoBilhete(){
        this.referencia = ++contador;
        this.TipoBilhete = TipoBilhete;
    }

    public TipoBilhete(String TipoBilhete){
        this.referencia = ++contador;
        this.TipoBilhete = TipoBilhete;
    }

    public TipoBilhete(TipoBilhete tp){
        this.referencia = tp.referencia;
        this.TipoBilhete = tp.TipoBilhete;
    }
    
    public int getReferencia(){
        return this.referencia;
    }

    public String getTipoBilhete() {
        return TipoBilhete;
    }

    public void setTipoBilhete(String TipoBilhete) {
        this.TipoBilhete = TipoBilhete;
    }

    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null || getClass() != obj.getClass()) { return false; }
        final TipoBilhete other = (TipoBilhete) obj;
        return this.TipoBilhete.equals(TipoBilhete);
    }

    @Override
    public String toString() {
        return "TipoBilhete{" + "TipoBilhete=" + TipoBilhete + '}';
    }
}