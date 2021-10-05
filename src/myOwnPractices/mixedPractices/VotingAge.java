package myOwnPractices.mixedPractices;
import java.util.Scanner;
public class VotingAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("PLease enter your age:");
        int ageOfVoting = scan.nextInt();
        if (ageOfVoting >= 18){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }
    }
}
