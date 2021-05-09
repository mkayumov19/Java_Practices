package MyOwnPractices.replitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class SwithcElementsMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        Arrays.toString(do_switch(arr));
    }

    public static int[] do_switch(int[] i) {
        int[]arr = i;
        int temp = 0;
        temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
