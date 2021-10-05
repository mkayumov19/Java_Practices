package myOwnPractices.replPractise;

public class FindingMaxLengthInStringArray {
    public static void main(String[] args) {
        String[] words = {"aaa", "bbbbb", "whasstupuppp", "longg" , "jaaaaavvaaaaaaaaaa"};
        String max = words[0];
        String min = words[0];
        for(String each : words){
            if( max.length() > each.length()){
                max = each;
            }
            if(min.length() < each.length()){
                min = each;
            }
        }
        System.out.println(max);
        System.out.println(min);
//                                      Option 2: below
//        String longestWord = words[0];
//        for (int i = 0; i < words.length; i++){
//            String currentWord = words[i];
//            if(currentWord.length() > longestWord.length()){
//                longestWord = currentWord;
//            }
//        }
//        System.out.println(longestWord);
    }
}
