package JavaClasses.day_10_shorthand_operators;
import java.util.Scanner;
public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rent and month: ");
        double rent = scan.nextDouble();                //----------------->> (nextInt/nextDouble + nextLine )
        scan.nextLine();                             //----------->> To fix the BUG. Work around: Add another nextLine()
        String month = scan.nextLine();


        System.out.println("Rent: "+rent);
        System.out.println("Months: "+month);


    }
}
