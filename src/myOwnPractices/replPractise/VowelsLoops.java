package myOwnPractices.replPractise;

public class VowelsLoops {
    public static void main(String[] args) {
        String word = "howdyho";
        for(int i = 0; i < word.length(); i++){
            char vowel = word.charAt(i);
            if (vowel == 'a' || vowel == 'e'|| vowel == 'i' || vowel == 'o' || vowel == 'u') {
                System.out.print(word.charAt(i));
            }
        }
    }
}
