package MyOwnPractices.replitTasks;
import java.util.*;
import java.util.Arrays;
import java.util.*;
public class InnerAndOuter {
    public static void main(String[] args) {

        int[] sizeOuter = {1,5,4,6};
        int[] sizeInner = {4,1};
        Arrays.sort(sizeOuter);
        Arrays.sort(sizeInner);
        int count = 0;
        for (int eachInner : sizeInner) {
            for (int eachOuter : sizeOuter) {
                if (eachInner == eachOuter) {
                    count++;
                    break;
                }
            }
        }
        System.out.println((count == sizeInner.length));
    }
}
