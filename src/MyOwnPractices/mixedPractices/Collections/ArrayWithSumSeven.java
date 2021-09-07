package MyOwnPractices.mixedPractices.Collections;

public class ArrayWithSumSeven {

    public static void main(String[] args) {
        int[] tempNums = {1,2,3,4,5,6,7,8,9};
        sumCounter(tempNums);
    }

    public static void sumCounter(int[] nums){
        for (int eachNum : nums) {
            for (int each : nums) {
                if (each + eachNum == 7){
                    System.out.println(each + " + " + eachNum + " = 7");
                }
            }
        }
    }
}
