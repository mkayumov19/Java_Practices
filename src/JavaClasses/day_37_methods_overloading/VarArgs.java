package JavaClasses.day_37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10, 6);
        addNumbers(10, 6,6,37,765,65);
        addNumbers(10, 6,6,37,765,65, -6, -65, 65);
        addNumbers();

        addWords("Hello", "How", "Are you", "today?");
    }
//  VARARGS is ... (3 dots)
    public static void addNumbers(int... nums){             // ---> means 0 or more int
//        its used in method, as regular array
        int sum = 0;
        for (int each : nums) {
            sum +=  each;
        }
        System.out.println("sum = " + sum);

    }

    public static void addWords(String... words){
        String sentence = "";
        for (String each : words) {
            sentence +=  each + " ";
        }
        System.out.println("Sentence = " + sentence);
    }
}
