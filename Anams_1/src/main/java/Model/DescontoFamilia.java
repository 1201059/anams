/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Interfaces.IDescontavel;

/**
 *
 * @author 35191
 */
public class DescontoFamilia implements IDescontavel {

    private static DescontoFamilia desconto;
    private int codigo;
    private String sigla;
    private String descricao;
    private float perc;
    private int numMinPessoas;

    private static final int CODIGO = 1;
    private static final String SIGLA = "FAM";
    private static final String DESCRICAO = "Este desconto aplica-se a famílias, tem que ter no mínimo 3 pessoas.";
    private static final float PERC = 0.05f;
    private static final int MINIMOPESSOAS = 3;

    public DescontoFamilia() {
        this.codigo = CODIGO;
        this.sigla = SIGLA;
        this.descricao = DESCRICAO;
        this.perc = PERC;
        this.numMinPessoas = MINIMOPESSOAS;
    }

    public static synchronized DescontoFamilia getinstance() {
        if (desconto == null) {
            desconto = new DescontoFamilia();
        }
        return desconto;
    }

    @Override
    public float obterDesconto(int qtd) {
        //int qtd = Utils.IntFromConsole("Introduza o número de bilhetes");
        if (qtd >= MINIMOPESSOAS) {
            return this.perc;
        }
        return 0;
    }

}
