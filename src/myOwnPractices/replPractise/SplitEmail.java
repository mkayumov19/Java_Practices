package myOwnPractices.replPractise;

public class SplitEmail {
    public static void main(String[] args) {
        String email = "makhmudik19@gmail.com";
        String[] emailArray = email.split("@");
        if(emailArray.length == 2){
            System.out.println("Email id: " + emailArray[0]+"\nEmail domain: " + emailArray[1]);
        } else {
            System.out.println("invalid email");
        }
    }
}
