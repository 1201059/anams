package Model;

import java.util.Objects;

/**
 *
 * @author grupo9
 */

class Notificacao {
    /**
     * O email do destinatario da notificação
     */
    private String email;
    /**
     * A descrição da notificação
     */
    private String descricao;
    /**
     * O valor default do email da notificação
     */
    private static final String EMAIL_POR_OMISSAO = "";
    /**
     * O valor default da descrição da notificação
     */
    private static final String DESCRICAO_POR_OMISSAO = "";

    /**
     * Constroi uma nova instancia de notificação com todos os parametros
     *
     * @param email O email da pessoa a enviar email
     * @param descricao A descrição da notificação
     *
     */
    public Notificacao(String email, String descricao) {
        this.email = email;
        this.descricao = descricao;
    }

    /**
     * Constroi uma nova instancia de notificação sem parametros
     *
     */
    public Notificacao() {
        this.email = EMAIL_POR_OMISSAO;
        this.descricao = DESCRICAO_POR_OMISSAO;
    }

    /**
     * Constroi uma nova instancia de notificação como copia da passada por
     * parametro
     *
     * @param n Notificação a copiar
     *
     */
    public Notificacao(Notificacao n) {
        this.descricao = n.descricao;
        this.email = n.email;
    }

    /**
     * Devolve a descrição da notificacao
     *
     * @return a descrição da notificação
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Devolve o email da notificacao
     *
     * @return O email da notificação
     */
    public String getEmail() {
        return email;
    }

    /**
     * Modifica o email da notificação
     *
     * @param email Email da notificação
     *
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Modifica a descrição da notificação
     *
     * @param descricao da notificação
     *
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Verifica a igualdade entre a notificação e um outro objeto
     *
     * @param obj objeto a comparar
     * @return true se são iguais, false caso contrário
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null) { return false; }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Notificacao other = (Notificacao) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.descricao, other.descricao);
    }

    /**
     * Devolve a descricao textual da notificação
     *
     * @return Descricao textual da notificação
     */
    @Override
    public String toString() {
        return "Email: " + email + " Descrição: " + descricao;
    }
}