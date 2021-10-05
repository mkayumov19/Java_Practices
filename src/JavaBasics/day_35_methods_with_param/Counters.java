package JavaBasics.day_35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        counts(5);
        counts(7);

        int num2 = 10;
        counts(num2);
        String word = "wooden spoon";           // count of string - 12
        counts(word.length());                  // counts = 12
        printAge(1963);
    }
    public static void counts(int num){
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
    public static void printAge(int bornYear){
        int currentYear = 2021;
        int age = currentYear - bornYear;
        System.out.println("Current age is: "+age+" for ones was born on: "+bornYear);
    }
}
