package myOwnPractices.replPractise;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Nurses Run"));
    }

    public static boolean isPalindrome(String check) {
        boolean isPalindrome = true;
        if (check.contains(" ")){
            check = check.replace(" ", "").toLowerCase();
        }else{
            check = check.toLowerCase();
        }
        for (int i = 0, j = check.length()-1; i < check.length()/2; i++, j--) {
            if (check.charAt(i) != check.charAt(j)){
                isPalindrome = false;
            }
        }
        return isPalindrome;

    }
}
