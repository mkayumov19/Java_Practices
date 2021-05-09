package JavaClasses.day_17_ternary_nested_icondition;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection1 = "Drink";
        String drinkItem = "Coke";
        String snackItem = "Chips";
        String snack2 = "Cookie";

        if (selection1.equals("Drink")) {
            System.out.println("Drink option selected");
            if (drinkItem.equals("Coke")) {
                System.out.println("Coke item selected");
            } else {
                System.out.println("Tea item selected");
            }
        } else {
            System.out.println("Snack option selected");
            if (snackItem.equals("Chips")) {
                System.out.println(snackItem + " option selected");
            } else {
                System.out.println(snack2 + " option selected");
            }
        }
    }
}
