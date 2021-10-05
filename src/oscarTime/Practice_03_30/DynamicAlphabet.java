package oscarTime.Practice_03_30;
import java.util.Scanner;
public class DynamicAlphabet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("choose: upper or lower?");
        String upperOrLower = scan.next();
        System.out.println("Do you want ascending or descending order?");
        String ascendingOrDescending = scan.next();

        int starting;
        int ending;
        if(upperOrLower.equalsIgnoreCase("upper")){
            starting = 'A';
            ending = 'Z';
        }else{
            starting = 'a';
            ending = 'z';
        }
        if(ascendingOrDescending.equalsIgnoreCase("ascending")){
            for(int i = starting; i <= ending; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = ending; i >= starting; i--) {
                System.out.print((char) i + " ");
            }
        }
    }
}
