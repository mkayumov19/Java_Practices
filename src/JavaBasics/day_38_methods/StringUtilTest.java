package JavaBasics.day_38_methods;

/** import all static methods. so that you can just call by method name, without classname */
import static JavaBasics.day_38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)){
            System.out.println("FAIL: Username cannot be null or empty");
        }

        System.out.println("Is Civic Palindrome? = "+ isPalindrome("civic"));
        System.out.println("Is Cybertek Palindrome? = "+ isPalindrome("Cybertek"));

        System.out.println("Reversed + to LowerCase = " + reverse("CYBERTEK"));
        System.out.println("Reversed + to UpperCase = " + reversedWord("Makhmudjon"));

    }

    public static boolean isPalindrome(String str){
        str=str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }

    public static String reversedWord(String word){
        word = word.toUpperCase();
        return new StringBuffer(word).reverse().toString();

    }

}
