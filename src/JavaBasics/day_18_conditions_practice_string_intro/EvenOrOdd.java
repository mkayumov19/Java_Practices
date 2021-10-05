package JavaBasics.day_18_conditions_practice_string_intro;

public class EvenOrOdd {
    public static void main(String[] args) {

        int num = 5;
        if (num % 2 == 0){
            System.out.println(num + " Num is Even number");
        } else if (num % 2 != 0){
            System.out.println(num + " is Odd number");
        }
        int num2 = 567, num3 = 8765;
        System.out.println(num2 % num3);
    }
}
