package OfficeHours.Practice_04_12;

public class MinAndMaxFromArray {
    public static void main(String[] args) {
        int[] arr = {3,1,5,3,10,4,3};
        int max = arr[0];
        int min = arr[0];
        for (int eachNum : arr) {
            if (eachNum < min){
                min = eachNum;
            }
            if (eachNum > max){
                max = eachNum;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
