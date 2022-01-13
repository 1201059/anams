/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.HashSet;

/**
 *
 * @author 35191
 */
public class Entidade {
    private int referencia;
    private String designacao;
    public HashSet<String> papeis;
    
    public Entidade(){
        this.referencia=referencia;
        this.designacao=designacao;
        this.papeis=papeis;
    }
    public Entidade(int referencia, String designacao, HashSet<String> papeis ){
        this.referencia=referencia;
        this.designacao=designacao;
        this.papeis= new HashSet();
    }
    public Entidade(Entidade En){
        this.referencia=En.referencia;
        this.designacao=En.designacao;
        this.papeis=En.papeis;
    }

    public int getReferencia() {
        return referencia;
    }

    public String getDesignacao() {
        return designacao;
    }

    public HashSet<String> getPapeis() {
        return papeis;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public void setPapeis(HashSet<String> papeis) {
        this.papeis = papeis;
    }
    
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Entidade other = (Entidade) obj;
        return this.referencia == other.referencia
                && this.designacao.equals(other.designacao)
                && this.papeis.equals(other.papeis);
    }

    @Override
    public String toString() {
        return "Entidade{" + "referencia=" + referencia + ", designacao=" + designacao + ", papeis=" + papeis + '}';
    }

}
