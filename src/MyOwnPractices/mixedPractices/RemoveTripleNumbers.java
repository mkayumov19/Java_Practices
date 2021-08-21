package MyOwnPractices.mixedPractices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveTripleNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 101, 200, 300));

        System.out.println(removeIfMoreThan100(list));
    }

    public static List<Integer> removeIfMoreThan100(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int each = it.next();
            if (each >= 100) {
                it.remove();
            }

        }
        return list;
    }

    /*
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,101,200,300));
    ArrayList<Integer> list2 = new ArrayList<>();
    for(int  each : lists1)
    if( each < 100)
    lists2.add(each);
    list1=list2;
    System.out.println(list1);
     */

}