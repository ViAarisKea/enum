package biludlejningsopgave;

public class Main {

    //Skriv en main-metode der instantierer et Garage-objekt og et antal bil-objekter af de 3 forskellige subtyper af Bil.
    // Tilføj bilerne til garagen.
    // Skriv alle bilerne ud, og kald også beregnGrønAfgiftForBilpark-metoden og skriv resultatet ud.
    public static void main(String[] args) {
        Garage garage = new Garage("Nørrebro garage");
        Bil dieselBil = new Dieselbil(20034, "BMW", "X5", 2007, 5, true, 15);
        Bil elBil = new Elbil(45889, "Tesla", "Model X", 2015, 5, 50000, 600, 20);
        Bil benzinBil = new Benzinbil(43566, "Lexus", "LX570", 2011, 7, 95, 13);

        garage.tilføjeBiler(dieselBil, elBil, benzinBil);

        for(Bil bil : garage.getBiler()){
            System.out.println(bil);
        }

        System.out.println(garage.beregnGrønAfgiftForBilpark());
    }
}
