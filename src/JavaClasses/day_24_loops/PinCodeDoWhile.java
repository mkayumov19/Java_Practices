package JavaClasses.day_24_loops;
import java.util.Scanner;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int secretPinCode = 1234;
        int pinCode;                      // if variable DECLARED in {}, that variable will be visible only inside that {}
        do {
            System.out.println("Please enter pin code");
            pinCode = scan.nextInt();
        }while (pinCode != secretPinCode);
        System.out.println("Welcome to your account");

    }
}
