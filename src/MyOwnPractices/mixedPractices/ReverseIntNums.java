package MyOwnPractices.mixedPractices;

import java.util.Scanner;

public class ReverseIntNums {
    public static void main(String[] args) {

        int reverse = 0;
            System.out.println("Enter an integer to reverse");
            Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        while(num != 0) {
            reverse = reverse * 10;
            reverse = reverse + num % 10;
            num = num/10;
        }

        System.out.println("Reverse of the number is " + reverse);
    }
}
