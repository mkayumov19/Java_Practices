package JavaClasses.day_24_loops;
import java.util.Scanner;
public class GiveMeFiveDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me $5");
        int dollar = scan.nextInt();
        while(dollar != 5){
            System.out.println("You gave me $" +dollar + " dollars. I need exactly $5 dollars");
            dollar = scan.nextInt();
        }
        System.out.println("Thank you for $5 bucks");
    }
}
