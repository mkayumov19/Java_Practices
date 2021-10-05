package oscarTime.Practice_03_17;
import java.util.Scanner;
public class AgeGroup {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if (age > 0 && age < 120 ){
            if (age <= 2){
                System.out.println("Infant");
            }else if(age >= 3 && age <= 5){
                System.out.println("Toddler");
            }else if(age > 5 && age <=9){
                System.out.println("Kid");
            }else if(age > 9 && age <= 12){
                System.out.println("Pre-teen");
            }else if(age > 12 && age <= 17){
                System.out.println("Teenager");
            }

        } else {
            System.out.println("Invalid age");
        }

    }
}
