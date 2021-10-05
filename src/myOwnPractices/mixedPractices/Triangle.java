package myOwnPractices.mixedPractices;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        int angle1, angle2, angle3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter angle 1 degree: ");
        angle1 = scan.nextInt();
        System.out.println("Please enter angle 2 degree: ");
        angle2 = scan.nextInt();
        System.out.println("Please enter angle 3 degree: ");
        angle3 = scan.nextInt();
        if ((angle1 + angle2 + angle3) == 180){
            System.out.println("Valid triangle");
        } else {
            System.out.println("Not valid triangle");
        }
    }
}
