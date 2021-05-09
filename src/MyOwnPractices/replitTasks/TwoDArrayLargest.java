package MyOwnPractices.replitTasks;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoDArrayLargest {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }
        }
        Arrays.sort(arr[0]);
        Arrays.sort(arr[1]);

        if(arr[0][arr[0].length-1]>arr[1][arr[1].length-1]){
            System.out.println(arr[0][arr[0].length-1]);
        }else{
            System.out.println(arr[1][arr[1].length-1]);
        }



    }
}

