package myOwnPractices.replPractise;

public class Overloading {
    public static void main(String[] args) {

    }

    public static int findMax(int[] num1){
        int max = num1[0];
        for (int i = 0; i < num1.length; i++){
            if (num1[i] > max){
               max = num1[i];
            }
        }
        return max;
    }

    public static double findMax(double[] num2){
        double max = num2[0];
        for (int i = 0; i < num2.length; i++){
            if (num2[i] > max){
                max = num2[i];
            }
        }
        return max;
    }
}
