package MyOwnPractices.replitTasks;

public class LimitString {
    public static void main(String[] args) {
        System.out.println(limit("abcde",3));
    }

    public static String limit(String text, int maxLength){
       String newWord = "";
        for (int i = 0; i < maxLength; i++){
            newWord += text.charAt(i)+"";
        }
        return newWord;
    }
}
