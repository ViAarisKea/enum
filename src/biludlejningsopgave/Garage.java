package biludlejningsopgave;

import java.util.ArrayList;
import java.util.Collections;

public class Garage {

    private String navn;
    private ArrayList<Bil> biler;

    public Garage(String navn) {
        this.navn = navn;
        this.biler = new ArrayList<>();
    }

    public void tilføjeBiler(Bil...bilArray){
        Collections.addAll(biler, bilArray);
    }

    @Override
    public String toString() {
        String string = "";
        for(Bil bil : biler){
            string += bil;
        }
        return string;
    }

    public double beregnGrønAfgiftForBilpark(){
        double totalGrønAfgift = 0;
        for(Bil bil : biler){
            totalGrønAfgift += bil.beregnGrønEjerafgift();
        }
        return totalGrønAfgift;
    }

    public String getNavn() {
        return navn;
    }

    public ArrayList<Bil> getBiler() {
        return biler;
    }
}
