package myOwnPractices.mixedPractices;

public class MissingChar {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten",1));
    }

    public static String missingChar(String str, int n) {
        String prefix = str.substring(0, n);
        String suffix = str.substring(n+1);
        str = prefix + suffix;
    return str;
    }

}
