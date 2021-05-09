package JavaClasses.day_09_scanner_practice;
import java.util.Scanner;
    public class MilesToKmConverter {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("============ MILES TO KM CONVERTED =============");
            System.out.println("Enter miles length:");
            double miles = scan.nextDouble();
            double kilometer = miles * 1.609;
            System.out.println(miles+ " miles in kilometers: "+kilometer);


    }

}
