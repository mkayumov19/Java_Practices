package JavaBasics.day_12_conditional_statements;
import java.util.Scanner;
public class IfElseStatement {
    public static void main(String[] args) {

        if (10 > 5){
            System.out.println("Condition is true!");
        }else{
            System.out.println("Condition is false!");
        }
        int count = 25;
        if (count > 30) {
            System.out.println(count + " is more than 30");
        }else{
            System.out.println(count + " is less than 30");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your exam score:");
        int input = scan.nextInt();
        int passingScore = 85;
        if(input > passingScore){
            System.out.println("You passed exam");
        }else{
            System.out.println("You failed exam");
        }
        byte age =25;
        if(age >= 18){
            System.out.println("Eligible to vote.");
            System.out.println("Age is equal or larger than 18.");
        }else{
            System.out.println("Age is less than 18.");
            System.out.println("Not eligible to vote.");
        }
    }
}
