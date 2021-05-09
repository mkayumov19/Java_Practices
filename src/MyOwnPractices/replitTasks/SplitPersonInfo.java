package MyOwnPractices.replitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class SplitPersonInfo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }
    public static void person(String info) {
        String[] eachWord = info.split(",");
        String name = eachWord[0];
        String lastName = eachWord[1];
        String age = eachWord[2];
        System.out.println("person name: "+name+"\nlast name: "+lastName+"\nage: "+age);
    }
}
