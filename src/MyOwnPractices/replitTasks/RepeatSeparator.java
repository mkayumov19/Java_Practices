package MyOwnPractices.replitTasks;

import javax.sound.midi.Soundbank;

public class RepeatSeparator {
    public static void main(String[] args) {
        String word = "Word";
        String seperator = "X";
        int count = 3;
        String result = word;
            for(int i = 1; i < count; i++) {
            result = result + seperator + word;
        }
            System.out.println(result);
    }
}
