package JavaBasics.day_53_inheritance_3.hiding;

public class PhoneTests {
    public static final String ANSI_GREEN = "\u001B[32m";
    public static void main(String[] args) {
        LandLinePhone landLinePhone = new LandLinePhone();
        Mobile mobile = new Mobile();

        landLinePhone.call();
        mobile.text();
        mobile.call();


    }
}
