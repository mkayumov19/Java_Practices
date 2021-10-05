package oscarTime.Practice_07_19;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    /*
    * Create a method that will accept a String and returns a String with the duplicate instances of characters removed
    Ex:
    Input: "AAABBBCCCD"
    Output: ABCD
     */
    public static void main(String[] args){
        System.out.println(removeDuplicateChars("AAABBBBCDDD"));

    }

    public static String removeDuplicateChars (String str) {
        Set<String> set = new HashSet<>(Arrays.asList(str.split("")));
//        return set.toString().replace("[","").replace("]","");
        return String.join("", set);
    }
}
