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
public class TipoEntidade {
    
private String TipoEntidade;
    
    public TipoEntidade(){
        this.TipoEntidade=TipoEntidade;
    }
    public TipoEntidade(String TipoEntidade){
        this.TipoEntidade=TipoEntidade;
    }
    public TipoEntidade(TipoEntidade te){
        this.TipoEntidade=te.TipoEntidade;
    }

    public String getTipoEntidade() {
        return TipoEntidade;
    }

    public void setTipoEntidade(String TipoEntidade) {
        this.TipoEntidade = TipoEntidade;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final TipoEntidade other = (TipoEntidade) obj;
        return this.TipoEntidade.equals(TipoEntidade);
    }

    @Override
    public String toString() {
        return "TipoEntidade{" + "TipoEntidade=" + TipoEntidade + '}';
    }
}

