package JavaBasics.day_31_array_class;
import java.util.Arrays;                        // IMPORT ARRAY CLASS TO USE ARRAY METHODS
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {5,8,7,68,105,19};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);                          //Arrays.sort - SORTS NUMS IN ASCENDING ORDER
        System.out.println(Arrays.toString(nums));  //Arrays.toString - TEMPORARY CHANGES NUMS TO STRING
        String name = Arrays.toString(nums);
        System.out.println(name + " --> This is String now");
        System.out.println("min value: "+nums[0]);
        System.out.println("max value: "+nums[nums.length-1]);

//      Ascending order works fine with Arrays
//      Descending order does not work with primitives, So we have to use Collections

        String[] letters = {"a","d","g","b","f","c","e"};
        System.out.println(Arrays.toString(letters) + " --> To String");
        System.out.println("<"+String.join(", ",letters)+"> --> String.join");       //Using String.join !!!!
        Arrays.sort(letters);
        System.out.println(Arrays.toString(letters) + " --> Sorted in Ascending");


        Arrays.sort(letters, Collections.reverseOrder());         // To do in REVERSE order
        System.out.println(Arrays.toString(letters) + " --> Sorted in Descending");

        int[] nomer ={33,55,56,300,30,60,35};
        Arrays.sort(nomer);
        System.out.println(Arrays.binarySearch(nomer, 57));
        if(Arrays.binarySearch(nomer, 12345) >= 0){
            System.out.println("12345 is present in array");
        }else{
            System.out.println("12345 is Not present in array");
        }
    }
}
