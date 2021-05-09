package OfficeHours.Practice_04_14;

public class LongestPalindrome {
    public static void main(String[] args) {
       String[]words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
       String longestPalindrome = "";

       for(String word : words){
           boolean ispalindrome = true;

           for (int i = 0; i < word.length()/2; i++) {
               if(word.charAt(i) != word.charAt(word.length()-1-i)){
                   ispalindrome = false;
                   break;
               }
           }
           if(ispalindrome && word.length() > longestPalindrome.length()){
               longestPalindrome = word;
           }
       }
        System.out.println(longestPalindrome);
    }
}
