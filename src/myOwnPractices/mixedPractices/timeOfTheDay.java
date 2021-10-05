package myOwnPractices.mixedPractices;
import java.util.Scanner;
    public class timeOfTheDay {
        public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
            System.out.println("Please enter hour");
            int hour = scan.nextInt();
            System.out.println("Please enter minute");
            int minute = scan.nextInt();
            System.out.println("Please enter second");
            int second = scan.nextInt();
            System.out.println("Choose AM or PM?");
            String amOrPm = scan.next();

            System.out.println(hour+":"+minute+":"+second+" "+amOrPm);



        }
}
