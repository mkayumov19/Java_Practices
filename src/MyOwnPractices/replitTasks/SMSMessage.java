package MyOwnPractices.replitTasks;

public class SMSMessage {
    public static void main(String[] args) {
        String message = "Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
        int start = message.indexOf("<");
        int end = message.indexOf(">");
        String sender = message.substring(start+1, end);
        System.out.println("Sender: " + sender);

        String mobile = message.substring( message.indexOf("[")+1, message.indexOf("]") );
        System.out.println("Phone Number: " + mobile);

        String text = message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("Message body: " + text);

        System.out.println(" Fikret ".trim());
        sender = sender.trim();
        if(sender.equals("Saim")) {
            System.out.println("Message from Saim about quiz");
        }else {
            System.out.println("Someone else message");

        }

    }
}
