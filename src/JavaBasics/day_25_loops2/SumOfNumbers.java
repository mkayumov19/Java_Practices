package JavaBasics.day_25_loops2;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
//          System.out.println(i);
            sum += i;
//          System.out.println("Summary of total: "+sum); --- > prints each sum as well
        }
        System.out.println("Summary of total: " + sum);     // ---- > prints total SUM at the end
        System.out.println("=============================");
//===================================================================================================
        int j = 0;
        int total = 0;
        while (j <= 5) {
            total += j;
            j++;
        }
        System.out.println("Total summary: " + total);
//        --------------------------------------------------------------------------
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            sum += i; // sum = sum + i;
        }
        System.out.println("sum = " + sum);
        System.out.println("==============================================");
//        ======================================================================================
//        int sum2 = 0;
//        sum2 += 1;
//        sum2 += 2;
//        sum2 += 3;
//        sum2 += 4;
//        sum2 += 5;
//        sum2 += 6;
//        sum2 += 7;
//        sum2 += 8;
//        sum2 += 9;
//        sum2 += 10;
//        System.out.println("sum2 = " + sum2);
//  ======================================================================
        int sum1 = 0;
        for (int num = 10; num <= 100; num++) {
            sum1 += num;
        }
        System.out.println("Sum of 10-100: " + sum1);
    }
}
