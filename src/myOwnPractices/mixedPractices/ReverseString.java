package myOwnPractices.mixedPractices;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Java interview is fun";
        String reversed = "";
        String[] arrWord = str.split(" ");
        for (int i = arrWord.length-1; i >= 0 ; i--) {
            reversed += arrWord[i] +" ";
        }
        System.out.println(reversed);


    }
}
