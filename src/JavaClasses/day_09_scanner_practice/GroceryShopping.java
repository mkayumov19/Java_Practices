package JavaClasses.day_09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter milk price: ");
        double milkPrice = scan.nextDouble();

        System.out.println("Enter bread price: ");
        double breadPrice = scan.nextDouble();

        System.out.println("Enter cucumber price: ");
        double cucumberPrice = scan.nextDouble();

        double totalPrice = milkPrice + breadPrice + cucumberPrice;
        System.out.println("Total price: $"+totalPrice);

    }
}
