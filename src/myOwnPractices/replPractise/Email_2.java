package myOwnPractices.replPractise;

public class Email_2 {
    public static void main(String[] args) {
        String email ="makhmudjon_kayumov@gmail.com";
        String firstName = email.substring(0,email.indexOf("_"));
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1);
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);
    }
}
