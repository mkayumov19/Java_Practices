package JavaClasses.day_24_loops;

import java.util.Scanner;

public class CountUntil {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        int numberToStop = keyboard.nextInt();
        int numberToStart = 1;
        while (numberToStart <= numberToStop) {
            System.out.print(numberToStart + " ");
            numberToStart++;
        }

    }
}
