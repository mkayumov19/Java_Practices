package MyOwnPractices.mixedPractices;

public class LastThreeChars {
    public static void main(String[] args) {
        System.out.println(last3Chars("Respect"));
    }

    public static String last3Chars(String str){
        String temp = str.substring(str.length()-3);
        return temp;
    }
}
