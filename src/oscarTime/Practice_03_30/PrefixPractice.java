package oscarTime.Practice_03_30;

import java.util.Scanner;

public class PrefixPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter word");
        String str = scan.next();
        System.out.println("Please enter number");
        int n = scan.nextInt();
        String prefix = str.substring(0, n);
        String remaining = str.substring(n);
        System.out.println(remaining.contains(prefix));


    }
}
