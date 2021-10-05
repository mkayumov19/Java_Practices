package myOwnPractices.mixedPractices;
import java.util.Scanner;
public class VideoGamesMachine {
    public static void main(String[] args) {
        int gumBall = 3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons = input.nextInt();
        if(coupons < gumBall) {
            System.out.println("Not enough coupons");
        }else{
        int candyBar = coupons / 10;
        int remainingCandy = coupons % 10;
        gumBall = remainingCandy / 3;
        int remainingGumBall = remainingCandy % 3;
        System.out.println("Number of Candies: " + candyBar);
        System.out.println("Number of Gumballs: " + gumBall);
        System.out.println(remainingGumBall+ " coupons left.");
        }
    }
}
