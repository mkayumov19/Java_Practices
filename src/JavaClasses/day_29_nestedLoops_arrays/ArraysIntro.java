package JavaClasses.day_29_nestedLoops_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int num = 10;                           //Single variable
        int[] nums = new int[3];                // ARRAY variable declaration. 3 shows how many vars needed
        nums[0] = 5;                            //starts from index number: 0
        nums[1] = 7;
        nums[2] = 10;
//      nums[3] = 15;                           //this line runs fine but gives OutOfBound error as declared only 3 arrays.
        System.out.println("Value at index 0 = "+nums[0]);
        System.out.println("Value at index 1 = "+nums[1]);
        System.out.println("Value at index 2 = "+nums[2]);

        int i = 0;                              // i takes and uses nums[0] value.
        System.out.println(nums[i]);            // 5.
        i++;
        System.out.println(nums[i]);            // 7. as 0+1=1. (Not 5+1)
        System.out.println(nums.length);        // 3. its numbers of declared arrays.
        int len = nums.length;                  // 3. assigning numbers of elements to len variable. .length doesn't have () here.
        System.out.println(len);

        nums[0] = 100;
        nums[1] = 150;
        nums[2] = nums[1];
        System.out.println("Nums 0 = " + nums[0]);
        System.out.println("Nums 1 = " + nums[1]);
        System.out.println("Nums 2 = " + nums[2]);

        int [] numsTwo = {234, 12, 343, 545, 234, 222, 99};
        System.out.println("Array elements numbers: " + numsTwo.length);
        System.out.println();

    }
}
