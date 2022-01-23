package Controller;

import Model.Festival;
import Model.GESTFEST;
import Model.TipoBilhete;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author grupo9
 */

public class UC11_RegistarPlaneamentoBilheticaController {
    private GESTFEST gestfest;
    private Festival festival;
    private PlanoBilheteira plano;
    private HashMap<LocalDate, HashMap<TipoBilhete, Integer>> planoFestival;
    private HashMap<TipoBilhete, Integer> planoDiario;

    public UC11_RegistarPlaneamentoBilheticaController(GESTFEST gestfest) {
        this.gestfest = gestfest;
    }
    
    public void consultarFestival(String festival){
        this.festival = gestfest.procuraFestival(festival);
    }

    public List<LocalDate> getDatas(){
        LocalDate startdate = festival.getDatainicio();
        LocalDate enddate =  festival.getDatafim();
        long numOfDaysBetween = startdate.until(enddate.plusDays(1), ChronoUnit.DAYS);
        List<LocalDate> datas = IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(i -> startdate.plusDays(i))
                .collect(Collectors.toList());
        return datas;
    }

    public List<TipoBilhete> setTipoBilhete(){
        this.gestfest.getLstTipoBilhetes() ;
    }

    public void newPlano(){
        planoFestival = new HashMap<>();
    }

    public void newPlanoDiario(){
        planoDiario = new HashMap<>();
    }

    public int getLotacao(LocalDate data){
         
    }

    public void setPlanoDiario(TipoBilhete tp, int numBilhetes){
        planoDiario.put(tp, numBilhetes);
    }

    public void setPlano(LocalDate d){
        planoFestival.put(d, this.planoDiario);
    }
}