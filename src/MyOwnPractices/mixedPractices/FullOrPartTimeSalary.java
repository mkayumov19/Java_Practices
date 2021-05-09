package MyOwnPractices.mixedPractices;
import java.util.Scanner;
public class FullOrPartTimeSalary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter salary amount");
        double salary = scan.nextDouble();
        System.out.println("Are you full time employee:" +
                " Yes or No:");
        String answer = scan.next();
        boolean isFullTime;
        if (answer.equals("Yes")){
            isFullTime = true;
            if(isFullTime);{
                salary += 20_000;
                System.out.println("New salary is: "+salary);
            }
        }else if (answer.equals("No")) {
            isFullTime = false;
            if (isFullTime); {
                salary -= 5000;
                System.out.println("New salary is: " + salary);
            }
        }
    }
}
