package JavaClasses.day_48_constructors_static.static_examples;

public class CalculatorTest {

    public static void main(String[] args) {
        //static way of calling the method
        Calculator.add(5,3);

        //we are creating an object as this method come from non-static method.
        Calculator calcobject = new Calculator();
        calcobject.multiply(5,5);

        //static object also can be called an Object.
        calcobject.add(5,6);            //but not needed, and it gives warning.

    }
}
