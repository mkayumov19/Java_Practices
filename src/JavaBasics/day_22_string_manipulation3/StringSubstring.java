package JavaBasics.day_22_string_manipulation3;

public class StringSubstring {
    public static void main(String[] args) {

        String word = "java is fun";
        System.out.println(word.substring(0, 2));       //starting and ending point -> prints between.
        System.out.println(word.substring(1));          //starting point -> prints all after starting point
        System.out.println(word.substring(2, 4));

//      System.out.println(word.substring(1, 6));       --> gives outofboundsexception as 6 not there.
//      System.out.println(word.substring(-1));         --> gives exception error

        System.out.println(word.substring(5));
        System.out.println(word.substring(0,4).equals("java") ? "java" : "not java");


    }
}
