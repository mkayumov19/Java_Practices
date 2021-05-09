package MyOwnPractices.replitTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CoverMe {
    public static void main(String[] args) {
        System.out.println(coverString("Certified Wooden Spoon", "o")); // "Certified W[o][o]den Sp[o][o]n"
    }

    public static String coverString(String main, String coverMe){
        if (main.contains(coverMe)){
            main = main.replace(coverMe,"["+coverMe+"]");
        }else{
            main = "["+main+"]";
        }

        return  main;
    }
}
