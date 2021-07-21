package JavaClasses.day_61_exceptions_collections;

public class ErrorExamples {
    public static void main(String[] args) {
        //StackOverFlowError creating using recursive method
        myMethod();
    }

    static int counter = 0;
    public static void myMethod(){
        if (counter <= 100) {
            System.out.println(counter++);
            myMethod();
        }
    }
}
