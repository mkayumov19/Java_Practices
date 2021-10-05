package myOwnPractices.advancedTasks;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your hourly rate:");
        double hourlyRate = scan.nextDouble();
        if (hourlyRate >=1 ){
            System.out.println("Please enter your weekly hours:");
            double weeklyHours = scan.nextDouble();
            if (weeklyHours > 0 && weeklyHours <= 65){
                System.out.println("Please enter number of weeks:");
                double numOfWeeks = scan.nextDouble();
                if (numOfWeeks >= 1 && numOfWeeks <= 52){
                   double salary =hourlyRate * weeklyHours * numOfWeeks;
                    System.out.println("Your annual salary is: $" + salary);
                }else{
                    System.out.println("If invalid print: Number of weeks cannot be less than 1 or greater than 52");
                }
            }else{
                System.out.println("Weekly Hours cannot be less than 1 or greater than 65");
            }
        }else{
            System.out.println("Hourly Rate cannot be Negative or Zero");
        }
    }
}
