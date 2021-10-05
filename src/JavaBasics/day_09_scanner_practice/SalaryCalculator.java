package JavaBasics.day_09_scanner_practice;
import java.util.Scanner;
    public class SalaryCalculator {
        public static void main(String[] args) {

            System.out.println("Please enter your weekly hours at work");
            Scanner scan = new Scanner(System.in);
            double weeklyHours = scan.nextDouble();
            System.out.println("Now Please enter your hourly rate");
            double hourlyRate = scan.nextDouble();

            double weeklyPay = weeklyHours*hourlyRate;
            double monthlyPay = weeklyPay * 52 / 12;
            double annualPay = monthlyPay * 12;

            System.out.println("Weekly pay: $"+weeklyPay);
            System.out.println("Monthly pay: $"+monthlyPay);
            System.out.println("Annual income: $"+annualPay);

        }

}
