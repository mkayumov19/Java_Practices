package myOwnPractices.replPractise;

public class SplitSentence {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        String[] sentArray = sentence.split(" ");
        for (int i = 0; i <= sentArray.length-1; i++){
            String each = sentArray[i];
            System.out.println(each);
        }
    }
}
