package JavaClasses.day_39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));      // show max num
        System.out.println(Integer.sum(10,5));      // show addition sum
        System.out.println(Integer.min(5,10));      // find minimum num

        System.out.println("Min Int: " + Integer.MIN_VALUE);
        System.out.println("Max Int: " + Integer.MAX_VALUE);
        System.out.println(Double.max(234.5,7253.6));
        System.out.println("Min Double: " + Double.MIN_VALUE);
        System.out.println("Max Double: " + Double.MAX_VALUE);

        System.out.println(Double.compare(5,1));                // 1 if first larger then second
        System.out.println(Double.compare(5,5));                // 0 if both equal
        System.out.println(Double.compare(5,45));               // -1 if first is smaller then second

        System.out.println(Character.isDigit('8'));         // returns true
        System.out.println(Character.isDigit('m'));         // returns false
        System.out.println(Character.isLetter('Q'));        // returns true
        System.out.println(Character.isAlphabetic('a'));    //isletter better and use that one.
        char letter = 'A';
        if (Character.isUpperCase((letter))) {
            System.out.println("it is uppercase");
        }
        String word = "JaVa iS fUn";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))){
                System.out.println(word.charAt(i));
            }
        }


    }
}
