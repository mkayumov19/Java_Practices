package MyOwnPractices.replitTasks;

import java.lang.reflect.Array;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        System.out.println(wordCount("Hello my friend my amigo"));
    }

    public static int wordCount(String words){
        int count = 0;
        String[] eachWord = words.split(" ");
        count = Array.getLength(eachWord);
        return count;
    }
}
