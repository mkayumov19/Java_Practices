package myOwnPractices.replPractise;

import java.util.Scanner;

public class AlejandrosEmail {
    public static void main(String[] args) {
        System.out.println("Please enter text with or without Alejandro");
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        if (a.toLowerCase().contains("alejandro")) {
            if (a.toLowerCase().contains("project")) {
                System.out.println("read");
            }else {
                System.out.println("don't read");
        }
        }else{
            System.out.println("don't read");
        }
    }
}
