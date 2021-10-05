package myOwnPractices.replPractise;

public class UtopianTree {
    public static void main(String[] args) {
        int year = 1;
        int santimetr = 0;
        int yearlyGrowth = 1;
        for (int i = 0; i <= 10; i++){
               if(year > i && year <= 3){
                   santimetr = 1;
                   System.out.println("year "+ year +" - growth " + santimetr + " cm");
                   System.out.println("tree size: "+yearlyGrowth+"cm");
                   yearlyGrowth = yearlyGrowth + santimetr;
                   year++;
               }
               if(year >= 4 && year <= 10) {
                   yearlyGrowth = yearlyGrowth + santimetr;
                   santimetr = 2;
                   System.out.println("year " + year + " - growth " + santimetr + " cm");
                   System.out.println("tree size: "+yearlyGrowth+"cm");
                   year++;
               }
        }
    }
}
