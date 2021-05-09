package JavaClasses.day_33_arrays_dimensional;

import java.util.Arrays;

public class ReversingArrayOne {
    public static void main(String[] args) {
        int[] nums = {5,10,4,100};
        int[] numsRev = new int[nums.length];


        for(int i = nums.length-1, j = 0;  i >= 0;  i--, j++){               // one ascending other descending loop
            numsRev[j] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numsRev));
//    ===================================================================================================
/**        Murodils code:
        //  0   1  2  3
        int[] nums = {5, 10, 4, 100};
        int[] numsRev = new int[nums.length]; //{0, 0, 0 ,0}
        //i = 3 ,  j = 0
        for(int i = nums.length -1, j = 0; i >= 0; i--, j++) {
            numsRev[j] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(numsRev));
*/
    }
}
