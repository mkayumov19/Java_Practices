package MyOwnPractices.mixedPractices;
import java.util.Scanner;
    public class PhoneNumber {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter area code:");
            int areaCode = scan.nextInt();
            System.out.println("Please enter local number:");
            int localNumber = scan.nextInt();

            String phoneNumber = "("+areaCode+")-"+localNumber;
            System.out.println("Calling number "+phoneNumber);

    }
}
