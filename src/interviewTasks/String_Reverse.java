package interviewTasks;

public class String_Reverse {

    /**
    Write a method that can reverse String
    Ex: Reverse("ABCD"); ==> DCBA
    */

    public static String strReverse(String str) {
        String reverse="";
        for(int i=str.length()-1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(strReverse("Palindrome"));
    }

}
