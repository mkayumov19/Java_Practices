package JavaBasics.day_09_scanner_practice;
import java.util.Scanner;
    public class AddNumbers {
        public static void main(String[] args) {

         System.out.println("Please enter 2 values");
         Scanner value = new Scanner(System.in);
         int num1 = value.nextInt();
         int num2 = value.nextInt();
         int result = num1+num2;
         System.out.println("User entered numbers: "+num1+" and "+num2);
         System.out.println("Addition of user numbers equal to: "+result);

    }
}
