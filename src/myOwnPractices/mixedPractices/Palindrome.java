package myOwnPractices.mixedPractices;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(divisionByHalfPalindrome("Anna"));
        System.out.println(newWayPalindrome("Annan"));
    }

    public static boolean divisionByHalfPalindrome(String str){
        boolean isPalin = false;
        for (int i = 0, j = str.length()-1; i < str.length()/2; i++, j--) {
            if (str.charAt(i) == str.charAt(j)){
                isPalin = true;
            } else {
                isPalin = false;
            }
        }
        return isPalin;
    }
//    ===========================================================================
    public static boolean newWayPalindrome(String str2){
        if (str2 == null){
            return false;
        }
        StringBuilder sbuild = new StringBuilder(str2);
        return sbuild.reverse().toString().equalsIgnoreCase(str2);

    }

}
