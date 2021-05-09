package JavaClasses.day_07_arithmetic_operators_casting;

public class DivisionProblem {

    public static void main(String[] args){

        int num1 = 10;
        int num2 = 3;
        System.out.println(num1/num2);      //3. whole number division dont show remainder

        // Double and Float can be used for division to show remainder.
        double dub1 = 10.0;
        double dub2 = 3.0;
        System.out.println(dub1/dub2);

        int count = 100;
        double dCount = 30.0;
        System.out.println(count/dCount);

        double num5 = 100.0;
        int num6 = 30;
        System.out.println(num5/num6);


    }
}
