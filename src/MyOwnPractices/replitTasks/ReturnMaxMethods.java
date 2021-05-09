package MyOwnPractices.replitTasks;

public class ReturnMaxMethods {
    public static void main(String[] args) {

        max(17,11);
    }

    public static int max(int x, int max) {
        int largest = 0;
        if (x > max) {
            System.out.println(x);
            return x;
        } else if (x < max) {
            largest = max;
            System.out.println(max);
            return max;
        } else {
            System.out.println(x);;
            return x;
        }
    }
}
