package Model;

/**
 *
 * @author grupo9
 */
public class Palco {

    private String nomePalco;
    private int lotacaoPalco;

    private static final String STRING_POR_OMISSAO = "";
    private static final int INT_POR_OMISSAO = 0;

    public Palco() {
        this.nomePalco = STRING_POR_OMISSAO;
        this.lotacaoPalco = INT_POR_OMISSAO;
    }

    public Palco(String nome, int lotacao) {
        this.nomePalco = nome;
        this.lotacaoPalco = lotacao;
    }

    public Palco(Palco palco) {
        this.nomePalco = palco.nomePalco;
        this.lotacaoPalco = palco.lotacaoPalco;
    }

    public String getNomePalco() {
        return nomePalco;
    }

    public int getLotacaoPalco() {
        return lotacaoPalco;
    }

    public void setNomePalco(String nomePalco) {
        this.nomePalco = nomePalco;
    }

    public void setLotacaoPalco(int lotacaoPalco) {
        this.lotacaoPalco = lotacaoPalco;
    }

    public boolean valida() {
        return true;
    }

    @Override
    public String toString() {
        return "Palco{" + "nomePalco=" + nomePalco + ", lotacaoPalco=" + lotacaoPalco + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Palco other = (Palco) obj;
        return this.nomePalco.equalsIgnoreCase(other.nomePalco)
                && this.lotacaoPalco == other.lotacaoPalco;
    }

}
