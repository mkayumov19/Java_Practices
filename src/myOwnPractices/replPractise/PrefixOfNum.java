package myOwnPractices.replPractise;

public class PrefixOfNum {
    public static void main(String[] args) {

        String str = "abXYabc";
        int n = 3;
        boolean isTrue;
        String result = str.substring(0,n);
        if (n <= str.length()) {
            if (str.substring(n).contains(result)) {
                isTrue = true;
                System.out.println(isTrue);
            }else{
                System.out.println(isTrue=false);
            }
        } else {
            System.out.println(isTrue=false);
        }
    }
}
