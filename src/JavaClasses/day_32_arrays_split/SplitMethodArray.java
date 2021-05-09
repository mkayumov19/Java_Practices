package JavaClasses.day_32_arrays_split;

import java.util.Arrays;

public class SplitMethodArray {
    public static void main(String[] args) {
        String words = "java,python,selenium,html";
        String[] splitWord = words.split(",");
        for (String eachWord : splitWord) {
            System.out.println(eachWord);
        }
        System.out.println("\n"+Arrays.toString(splitWord));
        System.out.println("Length of array: "+ words.length());

        String sentence = "Today I am coding java arrays";
        String[] wordsInSentence = sentence.split(" ");
        System.out.println("First word in sentence: "+ wordsInSentence[0]);
        System.out.println("First word in sentence: "+ sentence.split("")[0]);
        System.out.println("length of array "+wordsInSentence.length);

        for (String eachSentence : wordsInSentence) {
            System.out.print(""+eachSentence);
        }

    }
}
