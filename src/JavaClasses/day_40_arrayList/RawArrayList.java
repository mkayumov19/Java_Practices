package JavaClasses.day_40_arrayList;

import java.util.ArrayList;
import java.util.List;

public class RawArrayList {
    public static void main(String[] args) {

    // DECLARE Raw ArrayList:                   BUT THIS RAW WAY NOT RECOMMENDED TO USE!!!!
        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();

    //Add Data to ArrayList:
        list1.add("java");
        list1.add("apples");
        list1.add("coffee");
        list1.add(1234);
        list1.add(55.2);
        list1.add(true);

        System.out.println("list1 elements: " + list1);
        System.out.println("number of list elements: " + list1.size());
    }
}
