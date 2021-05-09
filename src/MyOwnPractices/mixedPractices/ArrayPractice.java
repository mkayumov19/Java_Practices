package MyOwnPractices.mixedPractices;
import java.util.*;
public class ArrayPractice {
    public static void main(String[] args) {

        int[][] data = new int[2][3];
        data[0][0] = 12;
        data[0][1] = 5;
        data[0][2] = 4;
        data[1][0] = 23;
        data[1][1] = 113;
        data[1][2] = 32;
        for (int i = 0; i < 2; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                System.out.print(data[i][j]+" ");

            }
        }

    }
}
