package interviewTasks;

public class Array_FindMaximum {
    /*
        Write a function that can find the maximum number from an int Array
     */

    public static void main(String[] args) {
        int[] temp = {1,2,3,4,9,6,7,8};
        System.out.println(maxValue(temp));

    }

    public static int maxValue(int[] n) {

        int max = Integer.MIN_VALUE;

        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }

        return max;
    }


}
