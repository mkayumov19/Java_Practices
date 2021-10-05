package JavaBasics.day_41_arraylist2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(120); nums.add(3); nums.add(1);

        System.out.println("before sort: " + nums);
        Collections.sort(nums);                         // Collections.sort --> for ArrayList<>  (sorts values)
        System.out.println("After sort: " + nums);


    }
}
