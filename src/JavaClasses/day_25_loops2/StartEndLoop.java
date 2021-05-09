package JavaClasses.day_25_loops2;
import java.util.*;
public class StartEndLoop {
    public static void main(String[] args) {
        int start = 0;
        int end = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter starting number");
        start = scan.nextInt();
        System.out.println("Please enter ending number");
        end = scan.nextInt();
        if(start > end) {
            System.out.println("Reverse numbers not accepted");
        }for (int i = start; i <= end; i++){
            i = start++;
            System.out.println(i);
        }
    }
}
