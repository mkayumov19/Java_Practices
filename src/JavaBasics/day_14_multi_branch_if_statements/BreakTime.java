package JavaBasics.day_14_multi_branch_if_statements;
import java.util.Scanner;
public class BreakTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter time:");
        char time = (char)scan.nextDouble();
        if (time % 2!=0 ) {
            double time1=time;
            System.out.println(time1);
        } else if (time == time) {
            System.out.println(time);
        }
    }
}


