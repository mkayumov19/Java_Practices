package JavaClasses.day_07_arithmetic_operators_casting;

public class OperatorPrecedence {
    public static void main(String[] args) {

        System.out.println(10+5);           //15
        System.out.println(10+5-3);         //12
        System.out.println(10-5+3);         //8
        System.out.println(10+(5-3));       //12

        System.out.println(2*3);            //6
        System.out.println(2*3/3);          //2
        System.out.println(20/(2*2));       //5

//      System.out.println(10/0);         Exception error/Java error while running code (division by 0 error)
        System.out.println(0/10);           //0
        System.out.println(2+5*3);          //17
        System.out.println((2+5)*3);        //21
        System.out.println(10/3);           //3     Java keeps whole number/does not show remainder ()

        double num1 = 10;
        double num2 = 3;
        System.out.println(num1/num2);      //Double and Float can be used for division to show remainder.

    }
}
