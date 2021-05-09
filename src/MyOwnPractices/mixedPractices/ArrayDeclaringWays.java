package MyOwnPractices.mixedPractices;

public class ArrayDeclaringWays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2,5,7};

        /** <----- OR -----> */

        int[] nums2 = new int[3];
        nums2[0] = 2;
        nums2[1] = 5;
        nums2[2] = 7;
        /** <----- OR -----> */

        int[] nums3 = {2,5,7};
    }
}
