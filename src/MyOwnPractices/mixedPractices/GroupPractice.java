package MyOwnPractices.mixedPractices;

import java.util.*;

public class GroupPractice {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        arrayList.add(0,10);
        System.out.println("arraylist"+arrayList);


        List<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        linkedList.add(4);
        System.out.println("linkedList"+linkedList);

        Vector<Integer> vector = new Vector<>();
        vector.add(0,1);
        System.out.println("vector"+vector);

    }
}
