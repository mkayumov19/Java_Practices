package myOwnPractices.mixedPractices;

public class TrueFalse {
    public static void main(String[] args) {

     int a = 1 ,b = 2, c = 3;
     String d = (a + b == c) ? "Yes" : "No";
         System.out.println(d);
      d = (a + c == b) ? "Yes" : "No";
        System.out.println(d);
        d = (b + c == a) ? "Yes" : "No";
        System.out.println(d);
    }
}
