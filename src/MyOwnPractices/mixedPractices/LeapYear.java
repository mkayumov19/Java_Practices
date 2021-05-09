package MyOwnPractices.mixedPractices;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter year number:");
        int year = scan.nextInt();
        if (year % 2 == 0) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
