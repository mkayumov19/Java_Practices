package JavaClasses.day_39_wrapper_classes;

public class WrapperClasses {
    public static void main(String[] args) {

        int num = 100;
        System.out.println("num is = " + num);
        num += 10;
        System.out.println(num);

        Integer n = new Integer(500);
        System.out.println("Is n 500? = " + n.equals(500));
        System.out.println(n + 300);
        Integer n2 = 1000;
        System.out.println("n2 became string using method: " + n2.toString() + n);
        String str = n2.toString();
        System.out.println("n2 assigned to String and printed: " + str);

        Byte b1 = new Byte((byte)5);
        Byte b2 = 10;

        Short sh1 = new Short((short)40);
        Short sh2 = 45;

        Integer i1 = new Integer(50);
        Integer i2 = 55;

        Long l1 = new Long(60);
        Long l2 = 65L;

        Double d1 = new Double(70);
        Double d2 = 45D;

        Character ch1 = new Character('a');
        Character ch2 = 'b';

        Boolean bool1 = new Boolean(true);
        Boolean bool2 = false;




    }
}
