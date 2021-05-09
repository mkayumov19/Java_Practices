package MyOwnPractices.replitTasks;
import java.util.*;
public class ShoppingList2 {
    public static void main(String[] args) {
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
        do {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter item" + count + " and its price:");
        item = scan.next();
        price = scan.nextDouble();
        System.out.println("Add one more item?");
        countinue = scan.next();

        shoppingListReport += "Item" + count + ": " + item + " Price: " + price +", ";
        totalPrice += price;
        count++;

        } while (count <= 10 && countinue.equalsIgnoreCase("yes") ? true : false);
        System.out.println(shoppingListReport.substring (0,shoppingListReport.length()-2));
        System.out.println("Total price: " + totalPrice);

    }
}
