package JavaBasics.day_18_conditions_practice_string_intro;

public class Authentication {
    public static void main(String[] args) {

        int las4SSN = 1234;
        int pinCode = 4321;
        int expLastSSN = 1239;
        int expPinCode = 4329;
        if (las4SSN == expLastSSN && pinCode == expPinCode){
            System.out.println("Authentication Pass");
        }else {
            System.out.println("Authentication Fail");
            if (las4SSN != expLastSSN || pinCode != expPinCode);
               if (las4SSN != expLastSSN && pinCode != expPinCode){
                   System.out.println("Pin code and SSN mismatch");
               } else if (las4SSN != expLastSSN) {
                   System.out.println("Last for of SSN does not match");
               } else if (pinCode != expPinCode) {
                   System.out.println("Pin Code does not match");
            }
        }
    }
}
