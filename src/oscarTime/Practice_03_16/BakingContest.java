package oscarTime.Practice_03_16;
import java.util.Scanner;
public class BakingContest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int judge = 1;
        System.out.println("Enter judge " + judge++ + " score");
        int scoreOne = scan.nextInt();
        System.out.println("Enter judge " + judge++ + " score");
        int scoreTwo = scan.nextInt();
        System.out.println("Enter judge " + judge++ + " score");
        int scoreThree = scan.nextInt();
        System.out.println("Enter other person's 1st score");
        int otherPerson1 = scan.nextInt();
        System.out.println("Enter other person's 2nd score");
        int otherPersons2 = scan.nextInt();

        int ourAverageScore = (scoreOne + scoreTwo + scoreThree) / 3;
        if (ourAverageScore > otherPerson1 && ourAverageScore > otherPersons2) {
            System.out.println("First place");
        } else if ((ourAverageScore > otherPerson1 && ourAverageScore < otherPersons2) ||
                (ourAverageScore < otherPerson1 && ourAverageScore > otherPersons2)) {
            System.out.println("Second place");
        } else {
            System.out.println("Third place");
        }
    }
}