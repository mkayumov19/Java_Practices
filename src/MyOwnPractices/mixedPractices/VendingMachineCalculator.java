package MyOwnPractices.mixedPractices;
import java.util.Scanner;
public class VendingMachineCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents");
        int amount = scan.nextInt();
        int quarter = 25, dime = 10, nickel = 5, pennie = 1;
        int quarterChange = amount / quarter;
        int extraQuarter = amount % quarter;

        int dimeChange = extraQuarter / dime;
        int extraDime = extraQuarter % dime;

        int nickelChange = extraDime / nickel;
        int extraNickel = extraDime % nickel;

        int pennieChange = extraNickel / pennie;

        if (amount <= 0 || amount >= 100){
            System.out.println("Invalid cents amount");
        }else{
            System.out.println("Your change is "+quarterChange+" quarters, "+dimeChange+" dimes, "+nickelChange+
                    " nickels and "+pennieChange+" pennies");

        }
    }
}
