package myOwnPractices.mixedPractices;

import java.util.Arrays;

public class ArrayConcat {
    public static void main(String[] args) {

     int[] arrOne = {1,2,3,4,5};
     int[] arrTwo = {6,7,8,9,10};
     int[] arrThree = new int[arrOne.length + arrTwo.length];

        for (int i=0, j=5; i < arrThree.length-1; i++, j++) {
            if (i < 5){
                arrThree[i] = arrOne[i];
                arrThree[j] = arrTwo[i];
            }
        }
        System.out.println(Arrays.toString(arrThree));
    }
}
