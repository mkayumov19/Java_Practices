package MyOwnPractices.replitTasks;
import java.util.Scanner;
public class Party {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "";
        String answer = "";
        String guestList = "";
        do {
            System.out.println("Please enter guest name:");
            name = scan.next();
            System.out.println("Do you want to enter new guest name:");
            answer = scan.next();
            guestList += name + ", ";

        } while (answer.equalsIgnoreCase("yes"));
        System.out.println("Guest's list: " + guestList.substring(0, guestList.length() - 2));

    }
}
