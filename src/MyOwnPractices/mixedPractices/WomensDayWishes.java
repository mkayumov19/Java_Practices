package MyOwnPractices.mixedPractices;

import java.util.Scanner;
public class WomensDayWishes {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Only female students, please enter your first name: ");
        String name = scan.next();
        String present = "\ud83d\udc3b";
        String present2 = "\uD83D\uDC90";
        System.out.println(ANSI_BLUE + "Dear B22 student "+name+
                ", Congratulations on behalf of all men in here! Happy Women's Day! This is your present: "+present+""+present2);
    }
}
