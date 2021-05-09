package MyOwnPractices.replitTasks;

public class PalindromeNum {
    public static void main(String[] args) {
        int num = 1001;
        isPalindrome(num);
    }

//    First, we find the remainder of the given num using (%)
//    Declare and multiply the variable Reverse by 10 and add remainder to it
//    Divide the num by 10
//    Repeat the above steps until num becomes 0
//    Need to keep original num in different variable not to loose it.

    public static void isPalindrome(int num){
        boolean isPalindrome = false;
        int reverse = 0;
        int num1 = num;
        for( ;num != 0; num=num/10) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
        }
        if(num1 == reverse){
            isPalindrome = true;
        }
        System.out.println(isPalindrome);
    }
}
