package MyOwnPractices.replitTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllReplit {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));
        String target = "hi";
        System.out.println(removeAll(list, target));

    }

    public static ArrayList<String> removeAll (ArrayList < String > wordList, String targetWord){
        ArrayList<String> str = new ArrayList<>();
        for (String str1 : wordList) {
            if (!str1.equalsIgnoreCase(targetWord)){
                str.add(str1);
            }
        }
        return str;
    }

}
