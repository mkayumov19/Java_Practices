package myOwnPractices.replPractise;
import java.util.*;
public class MakeLastArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int param = scan.nextInt();
        int[] nums = new int [param];
        for (int i = 0; i < param; i++){
            nums[i] = scan.nextInt();
        }
        int[] doubleNums = new int[nums.length*2];
        doubleNums[doubleNums.length-1] = nums[nums.length-1];
        String result = Arrays.toString(doubleNums);
        System.out.println(result);
    }
}
