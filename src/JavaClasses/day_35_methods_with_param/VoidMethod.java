package JavaClasses.day_35_methods_with_param;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VoidMethod {
    public static final String RED = "\033[0;31m";     // RED
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static void main(String[] args) {

        printAtoZ();
        for (int i = 0; i < 5; i++) {
            displayUSFlag();
        }
    }

        public static void printAtoZ() {
            for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " | ");
            }
        }
        public static void displayUSFlag() {
            String p1 = BLUE_BOLD+"* * * * * *"+RED+" ==================================\n"+BLUE_BOLD+"* * * * * *"+RED+" ==================================";
            String p2 = RED+"==============================================";
            System.out.println(BLUE_BOLD+"\n================== USA FLAG ==================");
            for (int i = 0; i < 4; i++) {
                System.out.println(p1);
            }
            System.out.println(BLUE_BOLD+"* * * * * *"+RED+" ==================================");
            for (int i = 0; i < 6; i++) {
                System.out.println(p2);
            }
        }
}
