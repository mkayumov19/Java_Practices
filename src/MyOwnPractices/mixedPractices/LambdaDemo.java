package MyOwnPractices.mixedPractices;

/**
 1. Brings Functional programming features to Java
 2. Code Optimization / Consize code
 - No Access modifier
 - No Return type
 - No Class name

 * Lambda Expressions can be invoked only with FUNCTIONAL INTERFACES!!!!!!1!!!
 Functional Interface - when interface has Single abstract method!..
 Functional Interface - can have any number of Default and Static methods!
 Ex:
 Runnable, Callable, Comparable, ActionListener   -> have Single abstract method.
 */

public interface LambdaDemo {

    public void demo1();
    }

    class demoRun implements LambdaDemo{
            public void demo1(){
                System.out.println("Hello Lambda");
            }
        }

    class lambdaTester {
            public static void main(String[] args) {
              LambdaDemo demo = new demoRun();
              demo.demo1();
        }
    }