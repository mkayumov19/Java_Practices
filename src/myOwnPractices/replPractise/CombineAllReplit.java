package myOwnPractices.replPractise;

import java.util.ArrayList;
import java.util.Collections;

public class CombineAllReplit {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int temp = 5;
        for(int i=0; i < temp; i++) {
            list1.add(i);
        }
        for(int i=6; i < temp; i++) {
            list2.add(i);
        }
        System.out.println(combineAll(list1, list2));
    }

    public static ArrayList<Integer> combineAll(ArrayList<Integer> numbersOne, ArrayList<Integer> numbersTwo) {
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < numbersOne.size(); i++) {
            nums.add(numbersOne.get(i));
        }
        for (int i = 0; i < numbersTwo.size(); i++) {
            nums.add(numbersTwo.get(i));
        }
        Collections.sort(nums);
        return nums;
    }
}
