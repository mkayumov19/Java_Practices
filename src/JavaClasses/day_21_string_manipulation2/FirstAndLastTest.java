package JavaClasses.day_21_string_manipulation2;

public class FirstAndLastTest {
    public static void main(String[] args) {

/**         indexOf() ---- searches for string and returns its index */

        String word = "java";
        System.out.println(word.indexOf("jav"));            //  returns only 1st letters index
        int letter = word.indexOf("av");                    // if 2 same letters --> returns 1st one only
        System.out.println(letter);

        //              012345
        String word1 = "github project";
        System.out.println(word1.indexOf("g"));             //0
        System.out.println(word1.indexOf("u"));             //4
        System.out.println(word1.indexOf("hub"));           //3
        System.out.println(word1.indexOf("java"));          //-1
        System.out.println(word1.indexOf("t"));             //2
    }
}

