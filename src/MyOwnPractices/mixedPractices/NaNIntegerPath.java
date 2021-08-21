package MyOwnPractices.mixedPractices;

import java.math.BigInteger;

public class NaNIntegerPath {
    public static void main(String[] args) {

        Integer num1 = 100;
        Integer num2 = 100;
        System.out.println("Case 1: = " + (num1 == num2));

        Integer num3 = 200;
        Integer num4 = 200;
        System.out.println("Case 2: = " + (num3 == num4));

        Long num5 = 200l;
        Long num6 = 200l;
        System.out.println("Case 3: = " + (num5 == num6));

        double nums1 = 0.0 / 0.0;
        System.out.println("Nums1: = " + nums1);

        double nums2 = 0.0 / 0;
        System.out.println("Nums2: = " + num2);

        double nums3 = 0 / 0.0;
        System.out.println("Nums3: = " + num3);



    }
}
