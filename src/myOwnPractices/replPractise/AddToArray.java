package myOwnPractices.replPractise;

import java.util.Arrays;
import java.util.Scanner;

public class AddToArray {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i <=size-1; i++){
            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);
    }

    public static void add_to_r(int[] arr,int n) {
        int[] myArr = new int[arr.length + 1];
        for (int i = 0; i < myArr.length - 1; i++) {
            myArr[i] = arr[i];
        }
        myArr[myArr.length - 1] = n;
        System.out.println(Arrays.toString(myArr));
    }

}
