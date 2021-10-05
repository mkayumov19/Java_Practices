package JavaBasics.day_40_arrayList;
import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();         // Polymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = "+nums.size());

        nums.add(1); nums.add(888);nums.add(3);nums.add(4);
        nums.add(5);nums.add(66);nums.add(77);nums.add(888);

        System.out.println("nums = " + nums);
        nums.remove(0);
        System.out.println("Removing 1 at index 0: " + nums);

//      nums.remove(66);               tries to remove num at index 66, which is not exist here, --> Error
//      System.out.println(nums);       index 66 --->
        nums.remove(new Integer(66));
        System.out.println("Removing Element 66: " + nums);

        // for loop - iterate through all values and print
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        // for each loop, and print all in the same line
        for (int each : nums) {
            System.out.print(each + " ");
        }
    }
}
