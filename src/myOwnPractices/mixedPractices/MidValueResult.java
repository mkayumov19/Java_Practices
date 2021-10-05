package myOwnPractices.mixedPractices;

public class MidValueResult {
    public static void main(String[] args) {
        int num1 = 5, num2 = 28, num3 = 14;
        if (num1 > num2 && num1 < num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 < num3) {
            System.out.println(num2);
        } else if (num3 > num1 && num3 < num2) {
            System.out.println(num3);

        }

    }
}

