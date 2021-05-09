package JavaClasses.day_35_methods_with_param;

import java.util.Scanner;

public class MultipleParams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter banana price");
        double d1 = scan.nextDouble();
        System.out.println("Enter apple price");
        double d2 = scan.nextDouble();
        showSum("Banana","Apple",d1, d2);
    }
    public static void showSum(String word1, String word2, double num1, double num2){
        System.out.println(word1 + " is $"+num1);
        System.out.println(word2 + " is $" +num2);
        System.out.println("Sum is $" + (num1+num2));
    }
}
