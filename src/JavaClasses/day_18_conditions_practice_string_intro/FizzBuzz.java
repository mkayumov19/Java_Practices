package JavaClasses.day_18_conditions_practice_string_intro;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number to check if its FizzBuzz");
        int number = scan.nextInt() ;
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        }else if(number % 3 ==0){
            System.out.println("Number is Fizz");
        }else if(number % 5 == 0) {
            System.out.println("Number is Buzz");
        }else {
            System.out.println("Not Fizz, not Buzz, not FizzBuzz");
        }
    }
}
