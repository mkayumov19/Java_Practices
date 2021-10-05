package myOwnPractices.replPractise;

public class ExtractNumFromString {
    public static void main(String[] args) {
        System.out.println(ExtractNum("aa2aa3"));
    }

    public static String ExtractNum (String s){
        String nums = "";
        for (int i = 0; i < s.length(); i++){
             if (Character.isDigit(s.charAt(i))){
                 nums += s.charAt(i);
             }
        }
        return nums;
    }
}
