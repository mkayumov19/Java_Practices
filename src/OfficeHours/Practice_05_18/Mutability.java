package OfficeHours.Practice_05_18;

import java.util.Arrays;
import java.util.Locale;

public class Mutability {
    public static void main(String[] args) {

        String one = "java";
        String two = one;
        String three = two.toUpperCase();
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

        System.out.println(two.toUpperCase() == three);

        one = "nova";
        System.out.println(one);
        System.out.println(two);

        int [] arr = {1,2,3};
        int [] arr2 = arr;
        arr2 [0] = 20;                                  //Array is MUTABLE
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

    }
}
