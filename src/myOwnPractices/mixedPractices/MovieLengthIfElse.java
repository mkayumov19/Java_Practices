package myOwnPractices.mixedPractices;
import java.util.Scanner;
public class MovieLengthIfElse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter value for duration of movie you would like to watch:");
        double movieLength = scan.nextDouble();
        double price = 0;

        if (movieLength == 1){
            System.out.println("price = " + 8.99);
        }
        else if (movieLength == 1.5){
            System.out.println("price = " + 10.50);
        }
        else if (movieLength == 2){
            System.out.println("price = " + 12.99);
        }
        else if (movieLength == 2.5){
            System.out.println("price = " + 14.50);
        }
        else if (movieLength == 3) {
            System.out.println("price = " + 15.99);
        }
        else {
            System.out.println("No movie available for " + movieLength + " hours.");
        }
    }
}
