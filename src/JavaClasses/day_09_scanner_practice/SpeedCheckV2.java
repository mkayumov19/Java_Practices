package JavaClasses.day_09_scanner_practice;
import java.util.Scanner;
public class SpeedCheckV2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            System.out.println("What is the posted speed limit?");
        int speedLimit = scan.nextInt();
            System.out.println("What is your speed limit?");
        int yourSpeed = scan.nextInt();
            System.out.println(yourSpeed+" mph?!");
        int overTheLimit = yourSpeed - speedLimit;
            System.out.println("You are driving "+overTheLimit+" mph over the limit. Slow down!");
    }

}
