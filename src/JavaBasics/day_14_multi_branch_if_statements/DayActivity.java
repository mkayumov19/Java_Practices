package JavaBasics.day_14_multi_branch_if_statements;

import java.util.Scanner;

public class DayActivity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the weather in your area?");
        String weather = scan.next();
        if (weather.equals("Sunny")) {
            System.out.println("If weather is "+weather+" go to park for hiking and code java.");
        } else if (weather.equals("Rainy")) {
            System.out.println("If weather is "+weather+" stay home, drink tea and keep coding java.");
        } else if (weather.equals("Snowy")) {
            System.out.println("If weather is "+weather+" clean the car then build snowman, drink hot chocolate, and code java");
        } else if (weather.equals("Windy")) {
            System.out.println("If weather is "+weather+" get ready for power loss, fly a kite, and code java");
        } else {
            System.out.println("Just keep coding java");
        }
    }
}
