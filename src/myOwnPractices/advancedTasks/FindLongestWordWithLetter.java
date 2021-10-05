package myOwnPractices.advancedTasks;
import java.util.Scanner;
public class FindLongestWordWithLetter {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "mouse";
        String word3 = "computer";
        int length1 = 0;
        int length2 = 0;
        int length3 = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your letter(Case sensitive):");
        String letter = scan.next();
        if (word1.contains(letter)) {
            length1 = word1.length();
        } if (word2.contains(letter)) {
            length2 = word2.length();
        } if (word3.contains(letter)) {
            length3 = word3.length();
        } if (length1 >= length2 || length1 >= length3 && word1.contains(letter)) {
               if (length1 > length2 && length1 > length3 && word1.contains(letter)) {
                System.out.println(word1);
             } else if (length1 == length2 && word1.contains(letter)) {
                System.out.println(word1 + " and " + word2 + " has \'" + letter + "\' and same number of characters");
             } else if (length1 == length3 && word1.contains(letter)) {
                System.out.println(word1 + " and " + word3 + " has \'" + letter + "\' and same number of characters");
             }
        }
        if (length2 >= length1 || length2 >= length3 && word2.contains(letter)) {
            if (length2 > length1 && length2 > length3 && word2.contains(letter)) {
                System.out.println(word2);
            } else if (length2 == length3 && word2.contains(letter)) {
                System.out.println(word2 + " and " + word3 + " has \'" + letter + "\' and same number of characters");
            }
        }
        if (length3 >= length1 || length3 >= length2 && word3.contains(letter)) {
            if (length3 > length1 && length3 > length2 && word3.contains(letter)) {
                System.out.println(word3);
                }else {
                System.out.println("None of words have: " + letter);
            }
        }
    }
}