package oscarTime.Practice_06_15;

public class Gmail extends Email{

    static String domain;

    static {
        domain = "Gmail";
    }

    public static void sendEmail(){
        System.out.println("Sending from GMAIL");
    }

    public static void sendSuperEmail(){
        Email.sendEmail();
    }

    public Gmail(String address, int numberOfEmail) {
        super(address, numberOfEmail);
    }

}