package biludlejningsopgave;

public class Elbil extends Bil{
    private int batterikapacitetKWh;
    private int maxKm;
    private int whPrKm;

    public Elbil(int regNr, String mærke, String model, int årgang, int antalDøre, int batterikapacitetKWh, int maxKm, int whPrKm) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batterikapacitetKWh = batterikapacitetKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    //For en Elbil gælder de samme regler som for benzinbilen,
    // blot skal man først omregne whPrKm til kmPrL.
    // Det gøres ved at dividere whPrKm med 91,25 og dernæst dividere 100 med dette tal.
    @Override
    public double beregnGrønEjerafgift() {
        double kmPrL = omregning();
        double grønEjerafgift = 0;
        if(kmPrL >20 && kmPrL < 50){
            grønEjerafgift = 330;
        }else if(kmPrL > 15 && kmPrL < 20){
            grønEjerafgift = 1050;
        }else if(kmPrL > 10 && kmPrL < 15){
            grønEjerafgift = 2340;
        }else if(kmPrL > 5 && kmPrL < 10){
            grønEjerafgift = 5500;
        }else if(kmPrL < 5){
            grønEjerafgift  = 10470;
        }
        return grønEjerafgift;
    }

    public double omregning(){
        double kmPrl = (whPrKm / 91.25) / 100;
        return kmPrl;
    }

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "Elbil{" +
                "batterikapacitetKWh=" + batterikapacitetKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                '}';
    }
}
