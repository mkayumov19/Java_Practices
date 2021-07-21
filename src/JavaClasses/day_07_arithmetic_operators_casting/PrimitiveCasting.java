package JavaClasses.day_07_arithmetic_operators_casting;

public class PrimitiveCasting {
    public static void main(String[] args) {

        int m1 = 4;
        byte b1 = (byte) m1;                //to cast we put smaller primitive "type" in "()"--> (smaller primitive type)
        System.out.println(b1);

//      int m1 = 4;                         will show error as int is bigger then byte
//      byte b1 = m1;                       in order to make it work we need to Cast it

        int num1 = 100;
        byte b2 = (byte)num1;
        short num2 = (short)num1;
            System.out.println(b2+"\t"+num2);

        int num8 = 50;
        long l1 = num8;                      // if changing to larger type, no casting needed
            System.out.println(l1);
        char letter = 'a'; //97
        int numLetter = letter;
            System.out.println(numLetter);
        char ch = 'J';
        int chNum = ch; //74
            System.out.println(chNum);
                                            //        byte - short - int - long - float - double
                                            //        char -> can cast to int
                                            //        boolean -> no casting
        double d = 10.5;
        short sh = (short)d;
            System.out.println(sh);//10

        double h = 123;
            System.out.println(h); // 123

        int num = 44;
        double k = num;
             System.out.println(k); // 44.0


    }
}
