package biludlejningsopgave;

public class Benzinbil extends Bil{
    private int oktantal;
    private int kmPrL;


    public Benzinbil(int regNr, String mærke, String model, int årgang, int antalDøre, int oktantal, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.oktantal = oktantal;
        this.kmPrL = kmPrL;
    }

    public int getOktantal() {
        return oktantal;
    }

    public void setOktantal(int oktantal) {
        this.oktantal = oktantal;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Benzinbil{" +
                "oktantal=" + oktantal +
                ", kmPrL=" + kmPrL +
                '}';
    }

    //For en Benzinbil er afgiften afhængig af kmPrL.
    // Hvis den er mellem 20 og 50 er den 330kr, mellem 15 og 20 er den 1050 kr,
    // mellem 10 og 15 er den 2340kr, mellem 5 og 10 er den 5500kr,  og under 5 er den 10470kr.
    @Override
    public double beregnGrønEjerafgift() {
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
}
