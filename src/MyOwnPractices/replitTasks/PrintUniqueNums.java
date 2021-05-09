package MyOwnPractices.replitTasks;

import java.util.Arrays;

public class PrintUniqueNums {
    public static void main(String[] args) {
        int[] nums = {7,9,215,51,93,129,9,1};
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int counter = 0;
          for (int j = 0; j < nums.length; j++) {
                if(nums[j] == nums[i]){
                    counter++;
                }
          }
            if(counter == 1){
                System.out.println(nums[i]);
            }
        }
    }
}
