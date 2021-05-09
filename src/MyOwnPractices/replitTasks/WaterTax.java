package MyOwnPractices.replitTasks;

public class WaterTax {
    public static void main(String[] args) {
        System.out.println(waterTax(86.70));
    }

    public static double waterTax(double units){
            double bill = 0.0;
            double underFifty = units * 0.60;
            double overFifty = units * 0.90;
            if(units <= 50){
                bill = underFifty;
            } else if (units > 50 && units <= 100){
                bill = overFifty;
            } else if (units > 100 && units <= 150){
                bill = overFifty + 50;
            } else if (units > 150){
                bill = overFifty + 100;
            }
            return bill;
        }

}
