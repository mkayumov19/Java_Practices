package JavaBasics.day_12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'J';
        boolean isBigger;
//        isBigger = letter1 >= letter2;
//        System.out.println(isBigger);
        System.out.println(letter1 == letter2);
        System.out.println(letter1 > letter2);
        System.out.println(letter1 < letter2);

        char grade = 'C';
        boolean pass = grade <= 'D';
        System.out.println("Did you pass exam? - "+pass);

    }
}
