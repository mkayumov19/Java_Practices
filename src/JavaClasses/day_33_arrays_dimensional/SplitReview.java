package JavaClasses.day_33_arrays_dimensional;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "hello_world";
        String[] strArr = word.split("_");
        System.out.println(Arrays.toString(strArr));

        String word2 = "https://learn.cybertekschool.com/courses/549";
        String[] tempArr = word2.split("/");
        System.out.println(Arrays.toString(tempArr));

        String word3 = "java program";
        String[] tempArr2 = word3.split("a");
        System.out.println(word3 + " ---> " + Arrays.toString(tempArr2));
        System.out.println(word3 + " ---> " + "'a' count = " + (tempArr2.length-1));

        String str = "java";
        String[] myArray = str.split("a");
        System.out.println(str + " ---> " + Arrays.toString(myArray));
        System.out.println(str + " ---> " + "'a' count = " + myArray.length);

        String str2 = "selenium";
        String[] temp = str2.split("");
        System.out.println(str2 + " ----> " + Arrays.toString(temp));

/**          REGEX - Regular expressions:               */
        String str3 = "java1html2sql";
        String[] strArray = str3.split("\\d");                  // <\\d> means 'any number' in regex
        System.out.println(str3+" ---> "+Arrays.toString(strArray));
        System.out.println(str3+" ---> "+str3.replaceAll("\\d","_"));

//=======================================================================================================
//          Checking password using regex matches.
        String password = "Abcd123_4";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")){
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

    }
}
