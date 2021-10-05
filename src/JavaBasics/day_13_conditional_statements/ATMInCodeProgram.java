package JavaBasics.day_13_conditional_statements;
import java.util.Scanner;
    public class ATMInCodeProgram {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("********** Welcome to TD bank ************");
            System.out.println("Please enter your pin: ");
            int inputPincode = scan.nextInt();
            int secretPincode = 1234;
            if (inputPincode == secretPincode){
                System.out.println("Pin code is correct! Welcome to your account");
            } else {
                System.out.println("Wrong Pin code entered! Please try again.");
            }
        }
}
