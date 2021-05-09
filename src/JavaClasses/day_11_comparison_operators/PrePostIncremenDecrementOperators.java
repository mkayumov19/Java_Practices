package JavaClasses.day_11_comparison_operators;

public class PrePostIncremenDecrementOperators {
    public static void main(String[] args) {
        int num1 = 1;
        num1++;
        ++num1;
        System.out.println(num1);
        int num2 =5;
        num2--;
        --num2;
        System.out.println(num2);

        int num3 = 4;                       // becomes -> 5 as well
        int num4 = ++num3;                  //PRE-INCREMENT -> 5
        System.out.println("num3 = "+num3+"\tPRE-INCREMENT\tnum4 = "+num4);

        int num5 = 5;
        int num6 = num5++;
        System.out.println("num5 = "+num5+"\tPOST-INCREMENT\tnum6 = "+num6);

        int apples = 5;
        int basket = ++apples;

        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars = 5;
        System.out.println(++cars);

        int sedans = 10;
        System.out.println(sedans++);
        System.out.println(sedans);

        int myNumber = 15;
        int yourNumber = ++myNumber;
        System.out.println(myNumber);
        System.out.println(yourNumber);

        int count = 35;
        System.out.println(++count);
        System.out.println(count++);

        int myNumber1 = 99;
        int yourNumber1 = myNumber1++;
        System.out.println(myNumber1);
        System.out.println(yourNumber1);

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
//          73  50  +   23
//              51
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);

    }

}
