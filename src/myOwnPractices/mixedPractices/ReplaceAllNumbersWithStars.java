package myOwnPractices.mixedPractices;

public class ReplaceAllNumbersWithStars {
    public static void main(String[] args) {

        /**
         Regular Expression, or regex or regexp in short, is extremely and amazingly powerful in searching and
         manipulating text strings, particularly in processing text files. One line of regex can easily replace
         several dozen lines of programming codes.
         */

        String str = "a12.334tyz.78x";
        str = str.replaceAll("[^a-zA-Z]", "*");     //replaces any character except Letters.
        System.out.println("a12.334tyz.78x = " + str);;

        String str2 = "a12.334tyz.78x";
        str2 = str2.replaceAll("[0-9]", "*");       //replaces only numbers
        System.out.println("a12.334tyz.78x = " + str2);

    }
}
