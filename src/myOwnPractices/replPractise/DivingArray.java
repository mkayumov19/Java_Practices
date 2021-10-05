package myOwnPractices.replPractise;
import java.util.*;
import java.util.Arrays;

public class DivingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        float total = 0;
        for(int i = 0, j = 1; i < 7; i++, j++) {
            System.out.println("Enter score for judge " + j + ":");
            score[i] = input.nextFloat();
        }
        System.out.println("Enter difficulty: ");
        float temp = input.nextFloat();
        Arrays.sort(score);
        for(int k = 1; k < score.length-1; k++) {
            total += score[k];
        }
        System.out.print("Total: " + total * temp * 0.6f);
    }
}
