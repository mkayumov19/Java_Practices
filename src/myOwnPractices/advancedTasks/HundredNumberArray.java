package myOwnPractices.advancedTasks;

public class HundredNumberArray {
    public static void main(String[] args) {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] += i+1;
            System.out.print(numbers[i]+" ");
        }
    }
}
