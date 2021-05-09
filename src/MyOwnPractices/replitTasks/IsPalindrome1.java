package MyOwnPractices.replitTasks;

public class IsPalindrome1 {
    public static void main(String[] args) {


        System.out.println(inPalindrome(1234321));
    }


    public static boolean inPalindrome(int number) {
        int reverse = 0; // 43
        int temp = number; // 123

        while (temp != 0) {

            int lastDigit = temp % 10; // 3
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
            // System.out.println(reverse);
        }
        return reverse == number;
    }

}


