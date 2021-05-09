package MyOwnPractices.mixedPractices;

import java.util.Scanner;
    public class ScannerPractice {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
                System.out.println("How old are you?");
            int age = input.nextInt();
                System.out.println("You don't look like "+age);
           Scanner carModel = new Scanner(System.in);
                System.out.println("What is your car model?");
           String modelOfCar = carModel.next();
                System.out.println("I love "+modelOfCar);
           Scanner location = new Scanner(System.in);
                System.out.println("Where are you from?");
           String hisLocation = location.nextLine();
                System.out.println("I have never been to "+hisLocation);


        }
}
