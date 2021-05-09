package MyOwnPractices.mixedPractices;
import java.util.Scanner;
public class GroupTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your 4 digit pin code");
        int pinCode = 8640;
        int input = scan.nextInt();

         if(input == pinCode){
             System.out.println("Menu: 1- withdraw 2- Deposit 3- Check 4- Balance");
         }else{
             System.out.println("Sorry your pin code is wrong. Please try again.");
         }


    }
}
