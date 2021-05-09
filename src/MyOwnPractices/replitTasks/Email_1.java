package MyOwnPractices.replitTasks;

public class Email_1 {
    public static void main(String[] args) {

        String email = "makhmudjon_kayumov@gmail.com";
        if(email.contains("_")){
            int underScore = email.indexOf("_");
            int atSign = email.indexOf("@");
            String mailBox = email.substring(atSign+1);
            String firstName = email.substring(0,underScore);
            String lastName = email.substring(underScore+1,atSign);
            System.out.println(lastName+email.charAt(underScore)+firstName+email.charAt(atSign)+mailBox);
        }else{
            System.out.println(email);
        }

    }
}
