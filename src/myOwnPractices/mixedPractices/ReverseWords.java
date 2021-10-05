package myOwnPractices.mixedPractices;

public class ReverseWords {
    public static void main(String[] args) {
        revWords("apple banana kiwi");
    }
    public static String revWords(String str) {
        String reversedWord = "";
        String[] words = str.split(" ");
        for(int i = words.length - 1; i >= 0; i--) {
            reversedWord += (words[i] + " ");
        }
        System.out.println(reversedWord);
        return reversedWord.trim();
    }
}

//    public static void main(String[] args) {
//        reverse("apple banana kiwi");
//    }
//    public static void reverse(String str) {
//        String[] word = str.split(" ");
//        for (int i = word.length - 1; i >= 0; i--) {
//            System.out.print(word[i] + " ");
//        }
//    }
//}