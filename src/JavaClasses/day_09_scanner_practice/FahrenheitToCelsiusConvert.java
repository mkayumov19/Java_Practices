package JavaClasses.day_09_scanner_practice;
import java.util.Scanner;
    public class FahrenheitToCelsiusConvert {
        public static void main(String[] args) {
            System.out.println("=======Fahrenheit to Celsius convert==========\n");
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Fahrenheit value:");

            double fahrenheitConvert = scan.nextDouble();
            double celsius = (fahrenheitConvert-32) * 5/9;
            System.out.println(fahrenheitConvert+" Fahrenheit in Celsius: "+celsius);


        }

}
