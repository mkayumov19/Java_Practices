package JavaBasics.day_08_casting_scanner;

                                //1)we need to type (import java.util.Scanner;) on top of Class name to import Scanner:
    import java.util.Scanner;
        public class ScannerIntro {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);  //------------------->2) create Scanner object using NEW keyword
            System.out.println("Please enter your first name: "); //----->3) prompt/ask a question to get Input:

            String firstName = scan.next();        //-------------------->4) capture entered input value onto variable
            System.out.println("Nice to meet you, "+ firstName);

            Scanner input = new Scanner(System.in);
            System.out.println("What is your full name? ");
            String fullName = input.nextLine();    //-------------------->input.nextLine used to get all input.
            System.out.println("Welcome a board, "+fullName);

            //scan.close(); ------------------its optional. to close the scanner
    }
}
