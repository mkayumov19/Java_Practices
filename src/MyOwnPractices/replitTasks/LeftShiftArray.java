package MyOwnPractices.replitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class LeftShiftArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();
        }
//        int[] zeroShifted = new int[size];
//        for (int i = 0; i < size -1; i++) {
//            zeroShifted[i] = nums[i+1];
//        }
//        zeroShifted[size-1] = nums[0];
//        System.out.println(Arrays.toString(zeroShifted));

        int temp = nums[0];
        for (int j = 0; j < size-1; j++) {
            nums[j] = nums[j+1];
        }
        nums[size-1] = temp;
        System.out.print(Arrays.toString(nums));
    }
}


