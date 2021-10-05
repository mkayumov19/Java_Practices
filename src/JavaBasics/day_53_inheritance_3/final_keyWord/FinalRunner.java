package JavaBasics.day_53_inheritance_3.final_keyWord;

public class FinalRunner {

    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
//        TestData.ADMIN_USERNAME = "change";           ERROR: cannot change value of final variable
        final int ssn = 17263542;
//        ssn = 24263542;                               ERROR: cannot change value of final variable

    }

}
