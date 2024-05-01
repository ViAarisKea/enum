import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       for(Months month:Months.values()){
           System.out.println(month.ordinal()+1 + " " + month);
       }
       Scanner scanner = new Scanner(System.in);
        System.out.println("choose a month from the list, type 1-12:");
        int monthNumber = scanner.nextInt();

        Months month = null;

        for(Months enumMonths : Months.values()){
            if(enumMonths.ordinal()+1 == monthNumber){
                month = enumMonths;
            }
        }
        System.out.println(month);
        switch(month){
            case JANUARY, FEBRUARY, DECEMBER -> System.out.println("It's winter");
            case MARCH, APRIL, MAY -> System.out.println("It's spring");
            case JUNE, JULY, AUGUST -> System.out.println("It's summer");
            case SEPTEMBER, OCTOBER, NOVEMBER -> System.out.println("It's autumn");
        }
    }
}
