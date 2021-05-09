package MyOwnPractices.replitTasks;

public class CountAppearance {
    public static void main(String[] args) {
        String[] strs = {"foo","a", "foo", "bar", "foo", "bla"};
        String word = "foo";

        System.out.println(countAppearance(strs, word));
    }

    public static int countAppearance(String[] str, String word) {
        int count =0;
        for (String each : str) {
            if(word.equals(each)){
                count++;
            }
        }
        return count;

    }
}