package MyOwnPractices.quiz_examples;

public class FirstQuizSamples {
    public static void main(String[] args) {

        long a =30L;
        long b = (short)a;
        System.out.println(b);

        float a1 =100.987_6543f;
        short b1=(byte)a1;
        byte c1=(byte)b1;
        System.out.println(c1);

        long a2 =3_000L;
        double b2 = (float)a2;
        System.out.println(b2);
        int i2=100;
        double d2=123;
        float f2=300;
//      i2=f2;                  -------> does not work
        d2=f2;
//      f2=d2;                  -------> does not work
        d2=i2;
//      i2=d2;                  -------> does not work

    }
}
