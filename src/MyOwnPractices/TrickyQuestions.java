package MyOwnPractices;

public class TrickyQuestions {
    public static void main(String[] args) {

        // Does the code below print
        // \u000d System.out.println(5 + 5);                             //10

//================================================================================================

//        String str = "ONE"+1+2+"TWO"+"THREE"+3+4+FOUR"+"FIVE"+5;
//        System.out.println(str);                                      //Compile Error

//================================================================================================

//        int num = 10 + +11 - -12 + +13 - -14 + +15;
//        System.out.println(num);                                        //75

//================================================================================================

        System.out.println("reversed word = " + reverse("Fikret"));
    }

//    Reverse String using Recursion in JAVA
    public static String reverse(String input) {
        if (input.isEmpty()) {
            System.out.println("String is empty now");
            return input;
        }
        return reverse(input.substring(1)) + input.charAt(0);
    }

}
