package MyOwnPractices.mixedPractices;
import java.util.Scanner;
public class FikretClass {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                System.out.println("WELCOME TO CHASE");
                System.out.println("enter your pin");
                int pinCode = scan.nextInt();

                if (pinCode == 8640) {
                    System.out.println("menu \n" + "witdrawal \n" + "deposit\n" + "check balance\n");
                }else {
                    System.out.println("wrong pasword\n" + "try again");
                }

            }
        }
