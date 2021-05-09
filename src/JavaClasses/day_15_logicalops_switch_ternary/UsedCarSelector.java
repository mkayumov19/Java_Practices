package JavaClasses.day_15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {

        double budget = 5000.0;
        String model = "Tesla";
        double carPrice = 4.999;

        if (carPrice <= budget && model.equals("Toyota") || (model.equals("Camry") && carPrice <= budget)){
            System.out.println("Ready to purchase model = "+model+", price $"+carPrice);
        } else {
            System.out.println("Not interested in model = "+model+", price $"+carPrice);
        }


    }
}
