package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grupo9
 */

class RegistoNotificacoes {
    /**
     * A lista de notificações.
     */
    private List<Notificacao> lstNotificacoes;
    /**
     * Constroi uma instancia de registo de notificações sem parametros
     */
    public RegistoNotificacoes() {
        this.lstNotificacoes = new ArrayList<>();
    }
    /**
     * Devolve a lista de notificacoes
     *
     * @return A lista de notificacoes
     */
    public ArrayList<Notificacao> getListaNotificacoes() {
        return new ArrayList<>(lstNotificacoes);
    }
    /**
     * Modifica a lista de notificacoes
     *
     * @param lstNotificacoes A nova lista de notificacoes
     */
    public void setListaNotificacoes(List<Notificacao> lstNotificacoes) {
        this.lstNotificacoes = new ArrayList<>(lstNotificacoes);
    }
    /**
     * Adiciona a notificacao à lista de notificacoes do utilizador
     *
     * @param notificacao Notificacao a adicionar
     */
    public void addNotificacao(Notificacao notificacao) {
        this.lstNotificacoes.add(notificacao);
    }
}