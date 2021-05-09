package OfficeHours.Practice_03_10;
import java.util.Scanner;
public class MovieDuration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter movie length: ");
        double movieLength = scan.nextDouble();
        double price = 0;
           if (movieLength > 0  && movieLength <=1) {
               price = 8.99;
               System.out.println("Movie length is: "+movieLength+" hours and price is: $"+price);
        }  if (movieLength > 1.0 && movieLength <= 1.5) {
               price = 10.5;
               System.out.println("Movie length is: "+movieLength+" hours and price is: $"+price);
        }  if (movieLength > 1.5 && movieLength <= 2.0) {
               price = 12.99;
               System.out.println("Movie length is: "+movieLength+" hours and price is: $"+price);
        }  if (movieLength > 2.0 && movieLength <= 2.5) {
               price = 14.5;
               System.out.println("Movie length is: "+movieLength+" hours and price is: $"+price);
        }  if  (movieLength > 2.5 && movieLength <=3) {
               price = 15.99;
               System.out.println("Movie length is: "+movieLength+" hours and price is: $"+price);
        }  if  (movieLength < 0 || movieLength > 3) {
             System.out.println("No movies available for: "+movieLength+" and price is: "+price);
        }

    }
}
