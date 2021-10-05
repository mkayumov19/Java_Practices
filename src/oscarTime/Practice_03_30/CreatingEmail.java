package oscarTime.Practice_03_30;
import java.util.Scanner;
public class CreatingEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words:");
        String wordOne = scan.next();
        String wordTwo = scan.next();
        String email = "";
        if (wordOne.length() >= 6 && wordTwo.length() >= 6){
            email = wordOne.substring(0,4);                         //to get 1st 3 letters
            email += wordTwo.substring(wordTwo.length()-3);         //to get last 3 letters
            email += "@mail.ru";
            System.out.println(email);
        }else{
            System.out.println("Invalid data");
        }
    }
}
