package OfficeHours.Practice_03_08;

public class CastingPractice {
    public static void main(String[] args) {
        //byte -> short -> int -> long -> float -> double

        byte b = 10;
        short s = b;
        byte b2 = (byte)s;

        double d = 5.3;
        int i = (short)(int)(byte) d;
        int i2 = (int)d;
        System.out.println(i2);         // 5
        System.out.println((double) i); // 5

        float f = 3.54f;
        float f2 = (float) 3.54;    // float = double

        float f3 = 5;               // float = int -> 5.0
        float f4 = 5.5f;            // float = double

        long l = 22313;             // long = int -> compiler thinks and accepts as int
        long l2 = 263546372837L;    // telling compiler using L its (Long)
//      long l3 = 263546372837;     -> does not work without L, thinks its int without L.

        double million = 1_000_000;     // print -> 1000000.0
        System.out.println(million);
    }
}
