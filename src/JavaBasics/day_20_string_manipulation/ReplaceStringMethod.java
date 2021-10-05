package JavaBasics.day_20_string_manipulation;

public class ReplaceStringMethod {
    public static void main(String[] args) {

/**    Searches in the string and replaces with another string */

        String word = "Java";
        System.out.println(word +"\t--->>\t"+ word.replace("a","u"));          //juvu

        String sentence = "Java strings are fun";
        System.out.println(sentence.replace("a","u"));
        System.out.println(sentence.replace("strings","conditions"));
        System.out.println(sentence.replace("Java ",""));

        
    }
}
