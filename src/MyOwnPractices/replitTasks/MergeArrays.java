package MyOwnPractices.replitTasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        System.out.println(Arrays.toString(mergR(nums1, nums2)));
    }

    public static int[] mergR(int[] a, int[] b) {
        int[]c = new int[a.length + b.length];
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for(int j = 0; j < b.length;j++) {
            c[count++] = b[j];
        }
        return c;
    }
}
