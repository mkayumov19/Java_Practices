package MyOwnPractices.replitTasks;

import java.util.Arrays;

public class FindSum {
    public static void main(String[] args){
        int[] num = {2,1,2,3,4};
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            sum += num[i];
        }
        System.out.println(Arrays.toString(num) + ") -> " + sum);
    }
}
