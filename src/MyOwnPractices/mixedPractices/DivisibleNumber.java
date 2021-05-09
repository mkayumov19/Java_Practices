package MyOwnPractices.mixedPractices;
import java.util.Scanner;
public class DivisibleNumber {
    public static void main(String[] args) {
        System.out.println("Please enter number:");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        boolean divisible;
        System.out.println("Please enter dividing number:");
        int num = scan.nextInt();
        if (input % num == 0){
            divisible = true;
            System.out.println(input+" is divisible by "+num+": "+divisible);
        } else if (input % num !=0){
            divisible = false;
            System.out.println(input+" is divisible by "+num+": "+divisible);
        }
    }
}
