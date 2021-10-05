package oscarTime.Practice_03_24;

public class CharIndex {
    public static void main(String[] args) {

        String s = "java";
//      System.out.println(s.charAt(s.length()));           // returns exception error as 4 does not exist in "java".
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(0) + s.charAt(3));          //returns int numbers from ASCII
        System.out.println(s.charAt(0) + "" + s.charAt(3));      // returns "ja"
        System.out.println(s.toUpperCase().charAt(0) + "" + s.charAt(3));

        System.out.println(s.indexOf("a"));
        System.out.println(s.indexOf('j'));
        System.out.println(s.indexOf('j') >= 0 ? "Contains" : "Not contains");
        System.out.println(s.indexOf('g') >= 0 ? "contains" : "not contains");
        System.out.println(s.replace("ja","Jo"));

    }
}
