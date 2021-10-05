package myOwnPractices.replPractise;

public class TripleInString {
    public static void main(String[] args) {
        String str = "abcXXXabc";
        int count = 0;
        for(int i = 0; i < str.length()-2; i++){
            char triple = str.charAt(i);
            if(triple == str.charAt(i + 1) && triple == str.charAt(i + 2)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
