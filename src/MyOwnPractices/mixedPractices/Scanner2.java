package MyOwnPractices.mixedPractices;
import java.util.Scanner;
    public class Scanner2 {
        public static void main(String[] args) {
           System.out.println("Please enter letter and complete the word: \"..ava\"");
           Scanner letterInWord = new Scanner(System.in);
           String letter = letterInWord.next();
           if (letter.contains("J")) {
               System.out.println("Your answer is correct");
               System.out.println("Full word is: Java");
        }  else {
               System.out.println("Your answer is not correct");
               System.out.println("Correct answer is: JAVA");
        }
     }
}
