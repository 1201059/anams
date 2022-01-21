package UI;

import Controller.UC05_RegistoFestivalController;
import Model.Entidade;
import Model.GESTFEST;
import Utilitarios.Utils;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;

/**
 *
 * @author grupo9
 */

public class UC05_RegistoFestivalUI {
    private GESTFEST gestfest;
    private UC05_RegistoFestivalController controller;

    public UC05_RegistoFestivalUI(GESTFEST gestfest) {
        this.gestfest = gestfest;
        this.controller = new UC05_RegistoFestivalController(gestfest);
    }

    public void run() {
        System.out.println("\nNovo Festival:");
        controller.novoFestival();
        controller.setDesignacao(introduzDesignacao());
        controller.setEdicao(introduzEdicao());
        controller.setLocalizacao(introduzLocalizacao());
        controller.setDataInicio(introduzDataInicio());
        controller.setDataFim(introduzDataFim());
        controller.setRecinto(introduzRecinto());
        int numpalcos = introduzNumpalcos();
        controller.setnumPalcos(numpalcos);
        controller.setlotacaoPalcos(introduzLotacaoPalcos());
        controller.setEntidades(introduzEntidades());

        apresentaDados();

        if (Utils.confirma("Confirma os dados do Festival? (S/N)")) {
            controller.registaFestival();
            System.out.println("Festival registado com sucesso!");
        }
    }

    private String introduzDesignacao() {
        return Utils.readLineFromConsole("Insira a designação do Festival");
    }

    private int introduzEdicao() {
        return Utils.IntFromConsole("Insira a edição do Festival");
    }

    private String introduzLocalizacao() {
        return Utils.readLineFromConsole("Insira a localização do Festival");
    }

    private LocalDate introduzDataInicio() {
        Date data = Utils.readDateFromConsole("Insira a data de início do Festival");
        return Instant.ofEpochMilli(data.getTime())
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate();
    }

    private LocalDate introduzDataFim() {
        Date data = Utils.readDateFromConsole("Insira a data de fim do Festival");
        return Instant.ofEpochMilli(data.getTime())
                        .atZone(ZoneId.systemDefault())
                        .toLocalDate();
    }

    private String introduzRecinto() {
        return Utils.readLineFromConsole("Insira o recinto do Festival");
    }

    private int introduzNumpalcos() {
        return Utils.IntFromConsole("Insira o número de palcos do Festival");
    }

    private int introduzLotacaoPalcos() {
        return Utils.IntFromConsole("Insira a lotação do Festival");
    }

    private HashSet<Entidade> introduzEntidades() {
        HashSet<Entidade> entidades = new HashSet<Entidade>();
        return entidades;
    }

    private void apresentaDados() {
        System.out.println(controller.getFestivalAsString());
    }
}