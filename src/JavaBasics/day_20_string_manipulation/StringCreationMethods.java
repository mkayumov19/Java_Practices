package JavaBasics.day_20_string_manipulation;
import java.lang.*;
import java.util.*;                            //------------>> to import all packages.
public class StringCreationMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/**
  ================================WAYS to USE String and its VALUE===============================================
**/
        "Hello".toUpperCase();
        String word = new String("HellO");
        String company = new String();
        String sentence = "  ..";
        System.out.println(word);
        System.out.println(company);
        System.out.println(sentence);
//  ===============================================================================================================

        String word1 = "potato";
        String word2 = new String("tomato");
        System.out.println(word1 +" "+word2);
//      word1.sout + enter ---> System.out.println("word1")

        String car = "Lexus";
//        car.isEmpty();
        System.out.println(car);                                    //lexus
        System.out.println(car.isEmpty());                          //false
        System.out.println(car.length() == 0);                      //false
        System.out.println(car.equals(""));                         //false
        System.out.println(car.equalsIgnoreCase(""));   //false
    }
}
