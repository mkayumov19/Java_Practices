package MyOwnPractices.mixedPractices;
import java.util.Scanner;
    public class PatientPortal {
        public static void main(String[] args) {
            String firstName, lastName, fullName, email, street, state, city, address, contacts;
            int age, zipCode;
            double height, weight;
            boolean isMarried;
            long workPhoneNumber, personalPhoneNumber;
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to the patient portal!\nPlease enter your personal information");
            System.out.println("Enter your first name");
            firstName = scan.next();
            System.out.println("Enter your last name");
            lastName = scan.next();

            System.out.println("Enter your email");
            email = scan.next();
            scan.nextLine();
            System.out.println("Enter your street");
            street = scan.nextLine();

            System.out.println("Enter your city");
            city = scan.next();

            System.out.println("Enter your state");
            state = scan.next();
            System.out.println("Enter your zip code");
            zipCode = scan.nextInt();
            System.out.println("Enter your work phone number");
            workPhoneNumber = scan.nextLong();
            System.out.println("Enter your personal phone number");
            personalPhoneNumber = scan.nextLong();
            System.out.println("Enter your age");
            age = scan.nextInt();
            System.out.println("Enter your height");
            height = scan.nextDouble();
            System.out.println("Enter your weight");
            weight = scan.nextDouble();
            System.out.println("Are you married?");
            isMarried = scan.hasNextBoolean();
            System.out.println("Patient personal information");
            contacts = "Contacts: work phone number - "+workPhoneNumber+", personal phone number - "+personalPhoneNumber+
                    ", email: "+email;
            System.out.println(contacts);
            fullName = "Full name: "+firstName+", "+lastName;
            System.out.println(fullName);
            address = "Address: "+street+", "+city+", "+state+" "+zipCode;
            System.out.println(address);
            System.out.println("Age: "+age+"\nHeight: "+height+"\nWeight: "+weight+" pounds\nMarried?: "+isMarried);

        }
}
