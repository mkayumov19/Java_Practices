package JavaBasics.day_14_multi_branch_if_statements;

public class CalculatorV1 {
    public static void main(String[] args) {
        char operator = '*';
        int num1 = 10;
        int num2 = 5;
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else if (operator == '*'){
            System.out.println(num1*num2);
        }else{
            System.out.println("Do nothing");
        }
    }
}
