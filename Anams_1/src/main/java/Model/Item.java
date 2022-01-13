package Model;

/**
 *
 * @author grupo9
 */

class Item {
    private int quantidade;
    private static final int quantidade_por_omissao = 1;

    public Item(int qtd) {
        this.setQuantidade(qtd);
    }

    public Item() {
        this.setQuantidade(quantidade_por_omissao);
    }

    public Item(Item i) {
        this.setQuantidade(i.quantidade);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "\nQuantidade: " + quantidade + "\n";
    }

    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) { return true; }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) { return false; }
        Item obj = (Item) outroObjeto;
        return (this.quantidade == obj.quantidade);
    }

    public boolean valida() {
        return true;
    }
}