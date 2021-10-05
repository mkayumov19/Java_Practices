package myOwnPractices.replPractise;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        String reversed = "";
        String[] sentenceArray = sentence.split(" ");
        for (int i = sentenceArray.length-1; i >= 0 ; i--) {
            reversed += sentenceArray[i] + " ";
        }
        System.out.println("Original: " + sentence.trim());
        System.out.println("Reversed: " + reversed.trim());
    }
}
