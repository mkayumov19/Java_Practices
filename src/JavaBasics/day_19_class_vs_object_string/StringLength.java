package JavaBasics.day_19_class_vs_object_string;

public class StringLength {
    public static void main(String[] args) {

        String name = "Navruz";
        System.out.println(name);
        System.out.println("value of name has: " + name.length() + " characters");
        System.out.println("Happy Navruz".length());

        String firstName = "Makhmudjon";
        int numOfName = firstName.length();                             //returned result assigned to int
        System.out.println("returned number of name - " + numOfName);

        String password = "abc123";

        if (password.length() >= 6 && password.length() <= 100) {
            System.out.println("Good Password");
        } else {
            System.out.println("Please enter at least 6 characters, and less than 100 characters");
        }
    }
}
