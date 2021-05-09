package JavaClasses.day_18_conditions_practice_string_intro;

public class ThreeNumbersLargest {
    public static void main(String[] args) {

        int num1 = 100, num2 = 200, num3 = 300;
        if (num1 >= num2 && num1 >= num3){
            System.out.println(num1 + " Num1");
        }else if (num2 >= num1 && num2 >= num3){
            System.out.println(num2 + " Num2");
        }else{
            System.out.println(num3 + " Num3");
        }
    }
}
