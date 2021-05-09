package JavaClasses.day_12_conditional_statements;
import java.util.Scanner;
    public class AmazonFreeShipping {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter total price: ");
            double totalPrice = scan.nextDouble();
            System.out.println("Minimum $25 shopping required to be eligible for free shipping");
            if(totalPrice >= 25){
                System.out.println("Your total price: $"+totalPrice+". You are eligible for free shipping.");
            }else{
                System.out.println("Your total is: $"+totalPrice+". Not available for free shipping," +
                        " please continue shopping.");
            }
            System.out.println("Thank you for using Amazon.");
        }
}
