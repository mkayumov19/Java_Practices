package JavaClasses.day_14_multi_branch_if_statements;
import java.util.Scanner;
public class MultiBranchIfStatements {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter number of day to get name of the week: ");
        int day = input.nextInt();
        if (day == 1) {
            System.out.println("Day "+day+" is Monday");
        } else if (day == 2) {
            System.out.println("Day "+day+" is Tuesday");
        } else if (day == 3) {
            System.out.println("Day "+day+" is Wednesday");
        } else if (day == 4) {
            System.out.println("Day "+day+" is Thursday");
        } else if (day == 5) {
            System.out.println("Day "+day+" is Friday");
        } else if (day == 6) {
            System.out.println("Day "+day+" is Saturday");
        } else if (day == 7) {
            System.out.println("Day "+day+" is Sunday");
        } else {
            System.out.println("There are seven days ow the week only!!");
        }

    }
}
