package MyOwnPractices.replitTasks;

import java.util.Arrays;

public class CopyCertainValues {
    public static void main(String[] args) {
        String[] arr = {"aa","be","lol","lel","oreo"};
        System.out.println(Arrays.toString(getWithE(arr)));
    }

    public static String[] getWithE(String[] arr){
        String[] fewValues = arr;
        String word = "";
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains("e")) {
               word += arr[i]+" ";
            }
        }
        fewValues = word.split(" ");
        return fewValues;
    }
}
