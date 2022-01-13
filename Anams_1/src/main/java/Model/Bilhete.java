package Model;

import java.util.Objects;

/**
 *
 * @author grupo9
 */

public abstract class Bilhete {
    private int codigoBilhete;
    private Festival bilheteFestival;

    private static int nrBilhete = 0;

    public Bilhete (){
        this.codigoBilhete = ++nrBilhete;
        this.bilheteFestival = new Festival();
    }

    public Bilhete(Festival bilheteFestival){
        this.codigoBilhete= ++nrBilhete;
        this.bilheteFestival= bilheteFestival;
    }

    public Bilhete(Bilhete bilhete){
        this.codigoBilhete= bilhete.codigoBilhete;
        this.bilheteFestival= bilhete.bilheteFestival;
    }

    public int getCodigoBilhete() {
        return codigoBilhete;
    }

    public Festival getBilheteFestival() {
        return bilheteFestival;
    }

    public void setCodigoBilhete(int codigoBilhete) {
        this.codigoBilhete = codigoBilhete;
    }

    public void setBilheteFestival(Festival bilheteFestival) {
        this.bilheteFestival = bilheteFestival;
    }

    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null || getClass() != obj.getClass()) { return false; }
        final Bilhete other = (Bilhete) obj;
        return this.codigoBilhete == other.codigoBilhete
                && this.bilheteFestival.equals(other.bilheteFestival);
    }

    @Override
    public String toString() {
        return "Bilhete{" + "codigoBilhete=" + codigoBilhete + ", bilheteFestival=" + bilheteFestival + '}';
    }   
}