package JavaClasses.day_09_scanner_practice;

import java.util.Scanner;
    public class askAgeV1 {
        public static void main(String[] args) {

          System.out.println("How old are you?");
          Scanner scan = new Scanner(System.in);
          int age = scan.nextInt();
          System.out.println(age+", That's Great age!");

        //scan.close(); ------------------its optional. to close the scanner

    }
}
