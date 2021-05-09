package MyOwnPractices.replitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class FibonacciNums {
    public static void main(String[] args) {
        int num = 8;
        fibonacci(num);
    }

    public static void fibonacci(int num) {
        int[] arr = new int[num + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        int result = arr[arr.length-1];

        System.out.println(result);
    }
}
