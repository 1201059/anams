package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author grupo9
 */

public class GESTFEST {
    private String designacao;
    private Date dataCriacao;
    private int nif;
    private int capitalSocial;
    private HashSet<Entidade> lstEntidades;
    private HashSet<Festival> lstFestivais;
    private HashSet<Bilhete> lstBilhetes;
    private HashSet<TipoEntidade> lstTipoEntidades;
    private HashSet<TipoBilhete> lstTipoBilhetes;
    private HashSet<Artista> lstArtistas;
    private List<PedidoConvite> lstPedidosConvite;
    private ArrayList<Convite> lstConvite;
    private List<Programa> lstPrograma;

    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;
    private static final Date DATE_DEFAULT = new Date();

    public GESTFEST() {
        this.designacao = STR_DEFAULT;
        this.dataCriacao = DATE_DEFAULT;
        this.nif = INT_DEFAULT;
        this.capitalSocial = INT_DEFAULT;
        this.lstEntidades = new HashSet<>();
        this.lstFestivais = new HashSet<>();
        this.lstBilhetes = new HashSet<>();
        this.lstTipoEntidades = new HashSet<>();
        this.lstTipoBilhetes = new HashSet<>();
        this.lstConvite = new ArrayList<>();
        this.lstPedidosConvite = new ArrayList<>();
    }

    public GESTFEST(String designacao, Date dataCriacao, int nif, int capitalSocial, PedidoConvite lstPedidosConvite, Convite lstConvite) {
        this.designacao = designacao;
        this.dataCriacao = dataCriacao;
        this.nif = nif;
        this.capitalSocial = capitalSocial;
        this.lstEntidades = new HashSet<>();
        this.lstFestivais = new HashSet<>();
        this.lstBilhetes = new HashSet<>();
        this.lstTipoEntidades = new HashSet<>();
        this.lstTipoBilhetes = new HashSet<>();
        this.lstPedidosConvite = new ArrayList<>();
        this.lstConvite = new ArrayList<>();
    }

    public GESTFEST(GESTFEST g) {
        this.designacao = g.designacao;
        this.dataCriacao = g.dataCriacao;
        this.nif = g.nif;
        this.capitalSocial = g.capitalSocial;
        this.lstEntidades = g.lstEntidades;
        this.lstFestivais = g.lstFestivais;
        this.lstBilhetes = g.lstBilhetes;
        this.lstTipoEntidades = g.lstTipoEntidades;
        this.lstTipoBilhetes = g.lstTipoBilhetes;
        this.lstPedidosConvite = g.lstPedidosConvite;
        this.lstConvite = g.lstConvite;
    }

    public HashSet<Festival> getLstFestivais() {
        return lstFestivais;
    }

    public void setLstFestivais(HashSet<Festival> lstFestivais) {
        this.lstFestivais = lstFestivais;
    }

    public HashSet<Bilhete> getLstBilhetes() {
        return lstBilhetes;
    }

    public void setLstBilhetes(HashSet<Bilhete> lstBilhetes) {
        this.lstBilhetes = lstBilhetes;
    }

    public HashSet<TipoEntidade> getLstTipoEntidades() {
        return lstTipoEntidades;
    }

    public void setLstTipoEntidades(HashSet<TipoEntidade> lstTipoEntidades) {
        this.lstTipoEntidades = lstTipoEntidades;
    }

    public void setLstTipoBilhete(HashSet<TipoBilhete> LstTipoBilhete) {
        this.lstTipoBilhetes = lstTipoBilhetes;
    }

    public HashSet<TipoBilhete> getLstTipoBilhetes() {
        return lstTipoBilhetes;
    }

    public void setLstEntidades(HashSet<Entidade> lstEntidades) {
        this.lstEntidades = lstEntidades;
    }

    public HashSet<Entidade> getLstEntidades() {
        return this.lstEntidades;
    }

    public void registarEntidade(Entidade entidade) {
        lstEntidades.add(entidade);

    }

    public Festival procuraFestival(String festival) {
        for (Festival f : lstFestivais) {
            if (f.getDesignacao().equals(festival)) {
                return f;
            }
        }
        return new Festival();
    }

    public void setLstTipoEntidade(HashSet<TipoEntidade> lstTipoEntidade) {
        this.lstTipoEntidades = lstTipoEntidade;
    }

    public boolean registaFestival(Festival festival) {
        lstFestivais.add(festival);
        return true;
    }

    public Entidade procuraEntidade(String entidade) {
        for (Entidade e : lstEntidades) {
            if (e.getDesignacao().equals(entidade)) {
                return e;
            }
        }
        return new Entidade();
    }

    public String getListaPedidosConvite() {
        StringBuilder sb = new StringBuilder();
        for (PedidoConvite p : this.lstPedidosConvite) {
            sb.append(p.toString());
        }
        return sb.toString();
    }

    public PedidoConvite obterPedidoConvite(int cod) {
        for (PedidoConvite p : this.lstPedidosConvite) {
            if (p.getCodPedidoConvite() == cod) {
                return p;
            }
        }
        return new PedidoConvite();
    }

    private boolean adicionaConvite(Convite convite) {
        return lstConvite.add(convite);
    }

    public Artista novoArtista() {
        return new Artista();
    }

    private boolean valida(Artista Artista) {
        boolean bRet = true;
        for (Artista a : this.lstArtistas) {
            if (Artista.equals(a)) {

                bRet = false;
            }
        }
        return bRet;
    }

    public boolean registaArtista(Artista a) {
        if (this.validaArtista(a) == true) {
            Notificacao n = new Notificacao(a.getEmail(), "Novo artista registado");
            this.addArtista(a);
            return true;
        }
        return false;
    }

    private boolean validaArtista(Artista a) {
        for (Artista artista : this.lstArtistas) {
            if (artista.equals(a)) {
                return false;
            }
        }
        return true;
    }

    private boolean addArtista(Artista a) {
        return this.lstArtistas.add(a);
    }

    public Artista procuraArtista(String artista){
        for (Artista a : this.lstArtistas) {
            if (a.getNomeComp().equals(artista)) {
                return a;
            }
        }
        return new Artista();
    }

    public boolean registaConvite(Convite c) {
        if (this.validaConvite(c) == true) {
            Notificacao n = new Notificacao(c.getArtista().getEmail(), "Novo convite registado");
            this.addConvite(c);
            return true;
        }
        return false;
    }

    private boolean validaConvite(Convite c) {
        for (Convite convite : this.lstConvite) {
            if (convite.equals(c)) {
                return false;
            }
        }
        return true;
    }

    private boolean addConvite(Convite c) {
        return this.lstConvite.add(c);
    }
    
    public void registarPrograma(Programa programa){
        lstPrograma.add(programa);
    }
    
    public Programa procurarPrograma(Festival festival){
        for(Programa p : lstPrograma){
            if(p.getFestival().equals(festival)){
                return p;
            }
        }
        return new Programa();
    }

    public ArrayList<Convite> getListaConvite() {
        return lstConvite;
    }

    public Artista getArtista(String artista) {
        for(Artista a : lstArtistas){
            if(a.getNomeComp().equals(artista)){
                return a;
            }
        }
        return new Artista();
    }
}