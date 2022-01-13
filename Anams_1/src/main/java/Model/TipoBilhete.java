/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 35191
 */
public class TipoBilhete {
    
    private String TipoBilhete;
    
    public TipoBilhete(){
        this.TipoBilhete=TipoBilhete;
    }
    public TipoBilhete(String TipoBilhete){
        this.TipoBilhete=TipoBilhete;
    }
    public TipoBilhete(TipoBilhete tp){
        this.TipoBilhete=tp.TipoBilhete;
    }

    public String getTipoBilhete() {
        return TipoBilhete;
    }

    public void setTipoBilhete(String TipoBilhete) {
        this.TipoBilhete = TipoBilhete;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TipoBilhete other = (TipoBilhete) obj;
        return this.TipoBilhete.equals(TipoBilhete);
    }
    @Override
    public String toString() {
        return "TipoBilhete{" + "TipoBilhete=" + TipoBilhete + '}';
    }
}
