package myOwnPractices.replPractise;
import java.util.Scanner;
public class HasSandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter sandwichword");
        String word = scan.next();
//      String word = "breadbread";  // 0 + 5 = 5 -> substring(5) -> jam.contain(bread)

        boolean isValid = false;
        String result = "";
        if(word.contains("bread")) { // 5,5
            int firstBread = word.indexOf("bread");
            if(word.substring(firstBread+5).contains("bread")) { //jambread
                int secondBread = word.lastIndexOf("bread");
                result = word.substring(firstBread + 5,secondBread);
                isValid = true;
            }
        }
        if(!isValid || result.isEmpty()) {
            System.out.println("nothing");
        } else {
            System.out.println(result);
        }
    }
}
