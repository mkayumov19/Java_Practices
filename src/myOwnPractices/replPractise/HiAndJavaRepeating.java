package myOwnPractices.replPractise;

public class HiAndJavaRepeating {
    public static void main(String[] args) {
        String str = "abc hi how hi";
        int length = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.contains("hi")){
                length++;
                str = str.replaceFirst("hi", "");
            }
        }
        System.out.println(length);
//        =========================================================================

        String word = "javaxjavaapplepearjavaegg";
        int found = 0;
        for(int i = 0; i < word.length()-3; i++){
            String javaWord = word.substring(i, i + 4);
            if (javaWord.equals("java")){
                found++;
            }
        }
        System.out.println(found);
    }
}
