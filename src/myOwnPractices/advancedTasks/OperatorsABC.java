package myOwnPractices.advancedTasks;

public class OperatorsABC {
    public static void main(String[] args) {

        int a = 3, b = 2;
        long c = (a-- + b) * 2 / 3 % 2;
        System.out.println(a +"\n"+ b +"\n"+ c);

        int numOne = 10;
        int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
        int biggest = numOne > numTwo ? numOne : numTwo;
        System.out.println(numOne + "\t" + numTwo + "\t" + biggest);

    }
}
