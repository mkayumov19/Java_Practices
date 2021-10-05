package myOwnPractices.replPractise;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("listen","silent"));
    }

    public static boolean isAnagram(String word1, String word2){
        boolean isAnagara = false;
        if(word1.length() != word2.length()){
            return false;
        }
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        for (int i = 0; i < word1.length(); i++){
            if(!word2.contains(word1.charAt(i)+"")){
                return false;
            }
        }
        return true;
    }
}
