package MyOwnPractices.replitTasks;

import java.util.Scanner;

public class Printing01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        String temp = "";
        for (int j = 0; j < arr.length; j++) {
            temp += arr[j].substring(0,3)+"\n";
        }
        System.out.println(temp);
    }
}
