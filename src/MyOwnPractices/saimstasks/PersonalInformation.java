package MyOwnPractices.saimstasks;
import java.util.Scanner;
public class PersonalInformation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int people = scan.nextInt();
        if (people < 2){
            System.out.println("Live with less than 2 people");
        } else if(people >= 3 && people <= 6){
            System.out.println("Live  with 3-6 people");
        } else if (people > 6){
            System.out.println("Live with more than 6 people");
        }
        System.out.println("What city do you live in?");
        scan.nextLine();                                        // scan.next helps below one to accept values
        String city = scan.nextLine();
        System.out.println(city + " is great city.");
        System.out.println("Do you live in downtown?");
        String downTown = scan.next();
        if (downTown.equals("Yes") || downTown.equals("yes")){
            System.out.println("Have you thought about moving to the suburbs?");
            String suburb = scan.next();
            if(suburb.equals("Yes") || suburb.equals("yes")){
                System.out.println("Do it its great");
            }else{
                System.out.println("You should think about it");
            }
        }
        System.out.println("Whats your favorite animal?");
        String animal = scan.next();
        System.out.println("Wow "+animal+" is a great animal.");
        System.out.println("How many pets do you want?");
        int pet = scan.nextInt();
        System.out.println("Interesting, do you want "+pet+" "+animal+"s?");

    }
}
