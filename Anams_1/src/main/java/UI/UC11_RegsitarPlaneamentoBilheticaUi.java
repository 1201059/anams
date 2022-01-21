package UI;

import Controller.UC11_RegistarPlaneamentoBilheticaController;
import Model.GESTFEST;
import Model.TipoBilhete;
import Utilitarios.Utils;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author grupo9
 */

public class UC11_RegsitarPlaneamentoBilheticaUI {
    private GESTFEST gestfest;
    private UC11_RegistarPlaneamentoBilheticaController controller;

    public UC11_RegsitarPlaneamentoBilheticaUI(GESTFEST gestfest){
        this.gestfest = gestfest;
        controller = new UC11_RegistarPlaneamentoBilheticaController(gestfest);
    }

    public void run(){
        controller.consultarFestival(introduzFestival());

        List<LocalDate> datas = controller.getDatas();
        List<TipoBilhete> tipoBilhete = controller.getTipoBilhete();
        for(LocalDate d : datas){
            controller.newPlanoDiario();
            for(TipoBilhete tp : tipoBilhete){
                controller.setPlanoDiario(tp, introduzNumBilhetes(controller.getLotacao(d),tp));
            }
            controller.setPlano(d);
        }

        apresentaDados();

        if(Utils.confirma("Prentende inserir este plano? (S/N)")){
            if(controller.registarPlano()){
                System.out.println("Plano de Bilhética inserido");
            }else {
                System.out.println("Plano não inserido");
            }
        }
    }

    private String introduzFestival(){
        return Utils.readLineFromConsole("Insira o festival a trabalhar");
    }

    private Integer introduzNumBilhetes(int lotacao, TipoBilhete tp){
        int a = 0;
        do{
            a = Utils.IntFromConsole("Insira o número de Bilhetes disponíveis para o tipo" + tp.getTipoBilhete());
        }while(a < 0 || a > lotacao);
        return new Integer(a);
    }
}