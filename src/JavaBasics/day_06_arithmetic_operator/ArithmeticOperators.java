package JavaBasics.day_06_arithmetic_operator;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int i = 10;
        int j = 5;
        int addition = i+j;
        int subtraction = i-j;
        int multiplication = i*j;
        int division = i/j;
        int mod = i%j;

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(mod);

        System.out.println((10+5)+(10-5));
        System.out.println(10*5);
        System.out.println(10/5);
        System.out.println(13%5);
        System.out.println(-2*2);

        int spoons = 10+20+35;
        System.out.println(spoons);
        int chairs =4+2-2*5/2;
        System.out.println(chairs);
//        System.out.println(0/0);            --------->     0/0 runs but gives Exception error.

    }
}
