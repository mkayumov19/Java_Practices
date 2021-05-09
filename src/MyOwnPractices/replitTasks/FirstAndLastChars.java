package MyOwnPractices.replitTasks;

import java.util.Arrays;

public class FirstAndLastChars {
    public static void main(String[] args) {
//        Given a String array words, iterate through each word and
//        print first and last letter of each element in separate lines.

        String[] word = {"hello","why","by","apple","note"};
        String newWord = "";
        for (String eachWord : word) {
            newWord += eachWord.charAt(0)+""+eachWord.charAt(eachWord.length()-1)+"\n";
        }
        System.out.println(newWord);

    }
}
