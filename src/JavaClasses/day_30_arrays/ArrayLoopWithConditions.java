package JavaClasses.day_30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
            String[] countries = {"Brazil",
                "China",
                "Cuba",
                "Sweden",
                "France",
                "Vietnam",
                "Albania",
                "Brazil",
                "Portugal",
                "China",
                "Philippines",
                "Philippines",
                "China",
                "Philippines",
                "China",
                "Armenia",
                "Philippines",
                "China",
                "Colombia",
                "Philippines",
                "Honduras",
                "Indonesia",
                "Brazil",
                "China",
                "United States",
                "Russia"};
        System.out.println("-----Prices More than 100-------");
        for (double eachPrice : prices){
        if(eachPrice > 100.0) {
            System.out.print(eachPrice + "  ");
          }
        }
        System.out.println("\n\n------prices between 10 and 70------");
        for( double eachSmallOnes : prices){
            if (eachSmallOnes >= 10 && eachSmallOnes <= 70){
                System.out.print(eachSmallOnes + "  ");
            }
        }
        System.out.println("\n\n------count of prices more than 50--------");
        int count = 0;
        for(double eachCount : prices){
            if (eachCount >= 50){
                count ++;
                System.out.println(count+") Price larger than 50 - "+count);
            }
        }
        System.out.print("Total larger than 50 = "+count);

        System.out.println("\n\n------countries with name length more than 7 - inclusive--------\n");
        for (String eachCountry : countries){
            if(eachCountry.length() >= 7){
                System.out.println("<"+eachCountry+"> \t---> Letters: "+eachCountry.length());
            }
        }

    }
}











