package myOwnPractices.replPractise;
import java.util.Scanner;
public class HasJava {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter word");
        String word = scan.next();
        if(word.length() > 3) {
            if (word.toLowerCase().substring(0).startsWith("java")) {
                word = word.substring(0, 4);
                System.out.println(true);
                }else if (word.toLowerCase().substring(1, 5).equals("java")) {
                word = word.substring(1, 5);
                System.out.println(true);
                }else if(!word.toLowerCase().substring(0).startsWith("java") || !word.toLowerCase().substring(1).startsWith("java")){
                System.out.println(false);
            }
        }else{
            System.out.println(false);
        }
    }
}
