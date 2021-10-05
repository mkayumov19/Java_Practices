package JavaBasics.day_38_methods;

import java.util.Arrays;

public class ArrayUtils {
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.println(num + " ");
        }
        System.out.println();
    }

    public static int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static boolean name(int[] nums, int num) {
        for (int each : nums) {
            if (num == each) {
                return true;
            }
        }
        return false;
    }

    public static boolean names(int[] temp, int number) {
        Arrays.sort(temp);
        if (Arrays.binarySearch(temp, number) >= 0) {
            return true;
        }
        return false;
    }

}
