package JavaClasses.day_09_scanner_practice;
import java.util.Scanner;
    public class CentsToDollarsScanner {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
                System.out.println("Type how much Cents in piggy:");
            int cents = scan.nextInt();
            int dollars = cents/100;
            int remainingCents = cents%100;
//              System.out.println("cents = "+cents);
                System.out.println("dollars = "+dollars);
                System.out.println("remaining cents = "+remainingCents);

            System.out.println(cents+" cents are "+dollars+" dollars and "+remainingCents+" cents");
    }
}
