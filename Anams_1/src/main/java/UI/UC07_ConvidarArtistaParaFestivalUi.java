package UI;

import Controller.UC07_ConvidarArtistaParaFestivalController;
import Model.Artista;
import Model.Festival;
import Model.GESTFEST;
import Utilitarios.Utils;

/**
 *
 * @author grupo9
 */

public class UC07_ConvidarArtistaParaFestivalUI {
    private GESTFEST gestfest;
    private UC07_ConvidarArtistaParaFestivalController controller;

    public UC07_ConvidarArtistaParaFestivalUI(GESTFEST gestfest) {
        this.gestfest = gestfest;
        controller = new UC07_ConvidarArtistaParaFestivalController(gestfest);
    }

    public void run() {
        System.out.println("\nConvidar artista para festival:");
        controller.novoPedidoConvite();
        introduzirFestival();
        introduzArtista();
    }

    private void introduzirFestival(){
        Festival festival;
        do{
            festival = controller.getFestival(Utils.readLineFromConsole("Insira o nome do festival:"));
        }while(festival.equals(new Festival()));
        controller.setFestival(festival);
    }

    private void introduzArtista() {
        Artista artista;
        do{
            artista = controller.getArtista(Utils.readLineFromConsole("Introduza o artista a convidar:"));
        }while(artista.equals(new Artista()));
        controller.setArtista(artista);
    }

    private void apresentaDados() {
        System.out.println("\nDados do processamento do pedido de encomenda:");
        System.out.println(controller.obterDados());
    }
}