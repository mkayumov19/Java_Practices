package myOwnPractices.replPractise;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveInstances {
    public static void main(String[] args) {
        ArrayList<Integer> beforeRemoved = new ArrayList<>(Arrays.asList(1,1,2,3,1,4));
        int num = 1;
        System.out.println(removeInst(beforeRemoved, num));
    }

    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < r.size(); i++) {
            if (r.get(i) != n){
                temp.add(r.get(i));
            }
        }

        return temp;
    }
}
