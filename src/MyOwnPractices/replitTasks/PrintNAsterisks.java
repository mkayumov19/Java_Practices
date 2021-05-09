package MyOwnPractices.replitTasks;

public class PrintNAsterisks {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <= n; i++){
            System.out.print("*");
        }
        int num1 = 80;
        int num2 = 20;
        for (int i = num1; i >= num2; i -=2){
            System.out.print("\n" + i + " ");
        }
    }
}
