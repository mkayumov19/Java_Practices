package myOwnPractices.replPractise;

public class BiggerString {
    public static void main(String[] args) {
        System.out.println(bigger("apple","orange"));
    }

    public static String bigger(String a, String b){
        String bigger = "";
        if (a.length() > b.length()){
            bigger = a;
        }else{
            bigger = b;
        }
        return bigger;
    }
}
