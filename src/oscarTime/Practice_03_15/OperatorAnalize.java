package oscarTime.Practice_03_15;

public class OperatorAnalize {
    public static void main(String[] args) {
         /*
        Analyze the following without intellij. Calculate the output step by step
         */
        int a = 5; // a = 6                         //--> 6
        int b = a++ + a-- + a * 2 + a + ++a;        //--> 32
        //      5   + 6  +  5 * 2 + 5 + 6
        //      5   + 6  +  10 + 5 + 6
        //      11  +  10 + 5 + 6
        //      21 + 5 + 6
        //      26 + 6
        //   b =  32
        System.out.println("a = " + a);
        System.out.println("b =  " + b);

        int a1 = 200;                               //--> 199
        int b1 = -a1++ + - --a1 * a1-- % 2 + a1;    //-->  -1
        System.out.println("a1 = "+a1);
        System.out.println("b1 = "+b1);

        int x = 300;                                // 300
        int y = 400;                                // 400
        int z = x + y - (x * y) + (x / y);          // -119300

        System.out.println(x+"\n"+y+"\n"+z);
    }
}
