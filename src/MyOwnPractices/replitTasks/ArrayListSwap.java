package MyOwnPractices.replitTasks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListSwap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one","two","three"));
        int pos1 =0;
        int pos2 =2;
        System.out.println(swap(list, pos1, pos2));
    }

    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2){
        Collections.swap(list, pos1, pos2);

        return list;
    }
}
