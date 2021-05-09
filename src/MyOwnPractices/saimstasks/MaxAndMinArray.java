package MyOwnPractices.saimstasks;

public class MaxAndMinArray {
    public static void main(String[] args) {
        int[] numbers = {99, 20, 2, 35, 95, 46, 5, 72, 31, 80, 110, 79};
        int max = numbers[0];
        int min = numbers[0];
        for (int eachNum : numbers){
            if (eachNum > max){
                max = eachNum;
            }
        }
        System.out.println(max + " is largest in Array");
        for (int eachNum : numbers){
            if(eachNum < min){
                min = eachNum;
            }
        }
        System.out.println(min + " is smallest in Array");
    }
}
