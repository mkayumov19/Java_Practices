package JavaBasics.day_15_logicalops_switch_ternary;
import java.util.Scanner;
public class GradeEvaluator {
    public static void main(String[] args) {

        char grade = 'a';
        if ((grade == 'A' || grade == 'a') || (grade == 'B' || grade == 'b') || (grade == 'C' || grade == 'c')){
            System.out.println("Passed exam with grade: " + grade);
        } else if (grade == 'D' || grade == 'd'){
            System.out.println("Qualify for retaking exam with grade: " + grade);
        } else if (grade == 'E' || grade == 'e'){
            System.out.println("Failed exam with grade: " + grade);
        } else {
            System.out.println("Invalid grade indicator entered: " + grade);
        }
//  same code with Scanner. instead of char -> String
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter exam grade: ");
        String grade2 = input.next();
        if ((grade2.equals("A") || grade2.equals("a") || (grade2.equals("B") || grade2.equals("b") || (grade2.equals("C") || grade2.equals("c"))))){
            System.out.println("Passed exam with grade: " + grade2);
        } else if (grade2.equals("D") || grade2.equals("d")){
            System.out.println("Qualify for retaking exam with grade: " + grade2);
        } else if (grade2.equals("E") || grade2.equals("e")){
            System.out.println("Failed exam with grade: " + grade2);
        } else {
            System.out.println("Invalid grade indicator entered: " + grade2);
        }
    }
}
