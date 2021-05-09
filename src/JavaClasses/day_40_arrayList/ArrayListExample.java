package JavaClasses.day_40_arrayList;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(11);
//      nums.add("java");           ----> ERROR

        System.out.println("size: " +nums.size());

        //reading from ArrayList:
        System.out.println("index 0: " + nums.get(0));
        System.out.println("index 1: " + nums.get(1));
        System.out.println("index 2: " + nums.get(2));
//      System.out.println("index 3: " + nums.get(3));  ---> OutOfBoundException as size is 3

        System.out.println(nums);
        nums.remove(1);                          // remove element at index 1
        System.out.println(nums);                      // 5, 11 printed
    }
}
