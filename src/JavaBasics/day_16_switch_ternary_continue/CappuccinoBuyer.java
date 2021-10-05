package JavaBasics.day_16_switch_ternary_continue;

public class CappuccinoBuyer {
    public static void main(String[] args) {

        double price = 0.0;
        double calories = 0.0;
        String size = "Grande";
        switch(size){
            case "Tall":
                System.out.println(size+" cappuccino please.");
                price = 3.20;
                calories = 8.0;
            break;
            case "Grande":
                System.out.println(size+" cappuccino please.");
                price = 3.99;
                calories = 14.0;
             break;
            case "Venti":
                System.out.println(size+" cappuccino please.");
                price = 4.30;
                calories = 20.0;
            break;
            default:
                System.out.println("We do not have that coffee today");
        }
        System.out.println(size+" cappuccino is $"+price+" and calories in that are: "+ calories);

    }
}
