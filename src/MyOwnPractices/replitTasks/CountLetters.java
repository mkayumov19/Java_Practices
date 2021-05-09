package MyOwnPractices.replitTasks;

public class CountLetters {
    public static void main(String[] args) {
        System.out.println(countLetters("aaabbbbccccc"));
    }

    public static String countLetters(String str){
        String letCount = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }
            }
            if(!letCount.contains(""+str.charAt(i))){
                letCount +=count+""+str.charAt(i);
            }
        }
        return letCount;
    }
}
