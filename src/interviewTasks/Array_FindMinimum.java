package interviewTasks;

public class Array_FindMinimum {

    /*
    Write a function that can find the maximum number from an int Array
     */

    public static void main(String[] args) {
        int[] temp = {1,2,3,7,4,5,6};
        System.out.println(minValue(temp));

    }

    public static int minValue(int[] n) {

        int min = Integer.MAX_VALUE;

        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }

        return min;

    }


}