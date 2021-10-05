package myOwnPractices.replPractise;

import java.util.Arrays;

public class Has55 {
    public static void main(String[] args) {
//        Given an array nums, print true if the array contains a 5 next to a 5 anywhere
//        in the array. If no consecutive 5s or no 5s are detected in your code then print false
        int[] nums = {1,5,1,1,5};
        boolean hasFives = false;
        for(int i = 0; i < nums.length-1; i++){
            if(Arrays.toString(nums).contains("5")){
                if(nums[i] == 5 && nums[i+1] == 5) {
                    hasFives = true;
                }
             }
        }
        System.out.println(hasFives);
    }
}
