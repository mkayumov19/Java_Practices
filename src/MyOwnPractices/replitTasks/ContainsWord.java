package MyOwnPractices.replitTasks;
import java.util.Scanner;
public class ContainsWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your word");
        String word = scan.nextLine();
        System.out.println("Please enter sentence");
        String sentence = scan.nextLine();
        System.out.println(sentence.contains(word));
    }
}
