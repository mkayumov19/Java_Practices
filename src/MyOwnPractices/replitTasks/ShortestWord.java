package MyOwnPractices.replitTasks;

public class ShortestWord {
    public static void main(String[] args) {
        String[] str = {"java", "cable", "red", "vivid", "remedy", "grace"};
        String temp = str[0];
        for (String eachWord : str) {

            if(eachWord.length() < temp.length()){
                temp = eachWord;
            }
        }
        System.out.println(temp);
    }
}
