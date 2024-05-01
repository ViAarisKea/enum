package biludlejningsopgave;

public class Dieselbil extends Bil{
    private boolean harPartikelfilter;
    private int kmPrL;

    public Dieselbil(int regNr, String mærke, String model, int årgang, int antalDøre, boolean harPartikelfilter, int kmPrL) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.harPartikelfilter = harPartikelfilter;
        this.kmPrL = kmPrL;
    }

    //For en Dieselbil er der samme afgift som for benzinbilen, plus en udligningsafgift,
    // som også afhængig af kmPrL. Hvis den er mellem 20 og 50 er udligningsafgiften 130kr,
    // mellem 15 og 20 er den 1390 kr, mellem 10 og 15 er den 1850kr,
    // mellem 5 og 10 er den 2770kr,  og under 5 er den 15260kr.
    // Der er desuden en partikeludledningsafgift på 1000 kr hvis bilen ikke har partikelfilter monteret.
    @Override
    public double beregnGrønEjerafgift() {
        double grønEjerafgift = 0;
        double udligningsafgift = 0;
        if(kmPrL >20 && kmPrL < 50){
            grønEjerafgift = 330;
            udligningsafgift = 130;
        }else if(kmPrL > 15 && kmPrL < 20){
            grønEjerafgift = 1050;
            udligningsafgift = 1390;
        }else if(kmPrL > 10 && kmPrL < 15){
            grønEjerafgift = 2340;
            udligningsafgift = 1850;
        }else if(kmPrL > 5 && kmPrL < 10){
            grønEjerafgift = 5500;
            udligningsafgift = 2770;
        }else if(kmPrL < 5){
            grønEjerafgift  = 10470;
            udligningsafgift = 15260;
        }
        grønEjerafgift += udligningsafgift;
        if(harPartikelfilter) grønEjerafgift+=1000;
        return grønEjerafgift;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Dieselbil{" +
                "harPartikelfilter=" + harPartikelfilter +
                ", kmPrL=" + kmPrL +
                '}';
    }
}
