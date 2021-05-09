package JavaClasses.day_38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums = {5,23,6,18,26,5};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[]{19,27,38,48,58,8});

        System.out.println("Sum = " + ArrayUtils.sum(nums));
        System.out.println("Sum = " + ArrayUtils.sum(new int[]{9,2,3,8,8,0}));

        System.out.println(ArrayUtils.name(new int[]{9,2,3,8,8,0}, 8));
        System.out.println(ArrayUtils.names(new int[]{19,12,13,18,18,10}, 88));
    }

}
