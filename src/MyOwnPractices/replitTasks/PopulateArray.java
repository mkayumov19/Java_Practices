package MyOwnPractices.replitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateArray {
    public static void main(String[] args) 	{
        int [] i= new int[new Scanner(System.in).nextInt()];
        i = populate(i) ;
        System.out.println(Arrays.toString(i));
    }

    public static int[] populate(int[] r) {
        for (int j = 0; j < r.length; j++) {
            r[j] = j+1;
        }
        return r;
    }
}
