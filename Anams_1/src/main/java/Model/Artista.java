package Model;

import java.util.Date;

/**
 *
 * @author grupo9
 */

public class Artista {
    /**
     * O nome completo.
     */
    private String nomeComp;
    /**
     * O numero de contribuinte.
     */
    private String nif;
    /**
     * A data de nascimento.
     */
    private Date dataNasc;
    /**
     * O numero de telemovel.
     */
    private int telemovel;
    /**
     * O email.
     */
    private String email;
    /**
     * O endereço postal.
     */
    private String endereco;
    /**
     * A password.
     */
    private String password;
    /**
     * O nome do cliente por omissão.
     */
    private static final String nomeComp_por_omissao = "";
    /**
     * O numero de contribuinte do cliente por omissão.
     */
    private static final String nif_por_omissao = "";
    /**
     * O numero de telemovel do cliente por omissão.
     */
    private static final int telemovel_por_omissao = 0;
    /**
     * O e-mail do cliente por omissão.
     */
    private static final String email_por_omissao = "";
    /**
     * O endereço postal do cliente por omissão.
     */
    private static final String endereco_por_omissao = "";
    /**
     * A password do cliente por omissão.
     */
    private static final String password_por_omissao = "";
    /**
     * Constroi uma instancia de cliente com valores por omissao aos devidos
     * atributos
     */

    public Artista() {
        this.setNomeComp(nomeComp_por_omissao);
        this.setNIF(nif_por_omissao);
        this.setDataNascimento(new Date());
        this.setTelemovel(telemovel_por_omissao);
        this.setEmail(email_por_omissao);
        this.setEndereco(endereco_por_omissao);
        this.setPassword(password_por_omissao);
    }

    /**
     * Constroi uma instancia de cliente com os valores passados por parametro
     *
     * @param nomeComp O nome completo do Artista
     * @param NIF O numero de contribuinte do cliente
     * @param dataNascimento A data de nascimento do cliente
     * @param nrTelemovel O numero de telemovel do cliente
     * @param email O e-mail do cliente
     * @param endereco O endereço postal do cliente
     *
     */
    public Artista(String nomeComp, String NIF, Date dataNascimento, int nrTelemovel, String email, String endereco) {
        this.setNomeComp(nomeComp);
        this.setNIF(NIF);
        this.setDataNascimento(dataNascimento);
        this.setTelemovel(nrTelemovel);
        this.setEmail(email);
        this.setEndereco(endereco);
    }

    /**
     * Constroi uma instancia de cliente por copia do cliente passado por
     * parametro
     *
     * @param a O Artista a copiar
     */
    public Artista(Artista a) {
        this.setNomeComp(a.nomeComp);
        this.setNIF(a.nif);
        this.setDataNascimento(a.dataNasc);
        this.setTelemovel(a.telemovel);
        this.setEmail(a.email);
        this.setEndereco(a.endereco);
        this.setPassword(a.password);
    }

    /**
     * Devolve a password do cliente.
     *
     * @return Password do cliente
     */
    public String getPassword() {
        return password;
    }

    /**
     * Modifica a password do cliente.
     *
     * @param password A password do cliente.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Devolve o numero de contribuinte do cliente.
     *
     * @return Numero de contribuinte do cliente
     */
    public String getNif() {
        return nif;
    }

    /**
     * Devolve o nome completo do cliente.
     *
     * @return Nome completo do cliente
     */
    public String getNomeComp() {
        return nomeComp;
    }

    /**
     * Modifica o nome completo do cliente.
     *
     * @param nomeComp O nome completo do cliente.
     */
    public void setNomeComp(String nomeComp) {
        this.nomeComp = nomeComp;
    }

    /**
     * Modifica o numero de contribuinte do cliente.
     *
     * @param nif O numero de contribuinte do cliente.
     */
    public void setNIF(String nif) {
        this.nif = nif;
    }

    /**
     * Devolve a data de nascimento do cliente.
     *
     * @return Data de nascimento do cliente
     */
    public Date getDataNasc() {
        return dataNasc;
    }

    /**
     * Modifica a data de nascimento do cliente.
     *
     * @param dataNasc A data de nascimento do cliente.
     */
    public void setDataNascimento(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    /**
     * Devolve o numero de telemovel do cliente.
     *
     * @return Numero de telemovel do cliente
     */
    public int getTelemovel() {
        return telemovel;
    }

    /**
     * Modifica o numero de telemovel do cliente.
     *
     * @param telemovel O numero de telemovel do cliente.
     */
    public void setTelemovel(int telemovel) {
        this.telemovel = telemovel;
    }

    /**
     * Devolve o e-mail do cliente.
     *
     * @return E-mail do cliente
     */
    public String getEmail() {
        return email;
    }

    /**
     * Modifica o e-mail do cliente.
     *
     * @param email O e-mail do cliente.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Devolve o endereço postal do cliente.
     *
     * @return Endereço postal do cliente
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * Modifica o endereço postal do cliente.
     *
     * @param endereco O endereço postal do cliente.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Valida o cliente.
     *
     * @return True caso o cliente seja valido
     */
    public boolean valida() {
        boolean condicao = true;
        if (this.nomeComp.equalsIgnoreCase(nomeComp_por_omissao)
                && this.nif.equalsIgnoreCase(nif_por_omissao)
                && this.email.equalsIgnoreCase(email_por_omissao)
                && this.endereco.equalsIgnoreCase(endereco_por_omissao)
                && this.dataNasc.equals(new Date())
                && this.telemovel == telemovel_por_omissao) {
            condicao = false;
        }
        return condicao;
    }

    /**
     * Devolve toda a descricao do cliente, nome completo, NIF, data de
     * nascimento, numero de telemovel e e-mail.
     *
     * @return nome completo, NIF, data de nascimento, numero de telemovel e
     * e-mail
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome completo: ").append(nomeComp).append("\n");
        sb.append("NIF: ").append(nif).append("\n");
        sb.append("Data de nascimento: ").append(dataNasc).append("\n");
        sb.append("Numero de telemovel: ").append(telemovel).append("\n");
        sb.append("E-mail: ").append(email).append("\n");
        sb.append("Endereço postal: ").append(endereco).append("\n");
        return sb.toString();
    }

    /**
     * Compara todos os parametros dos dois clientes.
     *
     * @param outroObjeto O outro cliente a comparar.
     *
     * @return trueORfalse Caso sejam iguais, retorna true
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) { return true; }
        if (outroObjeto == null || getClass() != outroObjeto.getClass()) { return false; }
        Artista obj = (Artista) outroObjeto;
        return (this.nomeComp.equalsIgnoreCase(obj.nomeComp)
                && this.dataNasc.equals(obj.dataNasc)
                && this.nif.equalsIgnoreCase(obj.nif)
                && this.email.equalsIgnoreCase(obj.email)
                && this.endereco.equalsIgnoreCase(obj.endereco)
                && this.telemovel == obj.telemovel
                && this.password.equals(obj.password));
    }
}