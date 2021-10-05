package interviewTasks;

import java.util.Arrays;

public class Array_MoveAllZerosToTheEnd {

    /*
    write a program that can move all the zeros to the end of an array
     */

    public static void main(String[] args) {

        int[] array1 = {1,0,4,5,0,3,0,7};
        moveZerosToTheEnd(array1);
        System.out.println(Arrays.toString(array1));

    }

    public static int[] moveZerosToTheEnd(int[] array) {

        int[] result = new int[array.length];
        int count = 0;

        for (int each : array) {
            if (each != 0)
                result[count++] = each;
        }

        return result;

    }


}
