package MyOwnPractices.replitTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one apple","two orange","four banana"));
        String find = "four";
        search(list, find);
        System.out.println(search(list, find));

    }

    public static String search(ArrayList<String> r, String find) {
        String word = "";
        for (int i = 0; i < r.size(); i++) {
            if(r.get(i).contains(find)){
               word = r.get(i);
               return word;
            }
        }
        for (String each : r) {
            if (!each.contains(find)){
                word = "search failed";
            }
        }

        return word;
    }
}
