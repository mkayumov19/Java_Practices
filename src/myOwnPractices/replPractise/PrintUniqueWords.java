package myOwnPractices.replPractise;

public class PrintUniqueWords {
    public static void main(String[] args) {
//                          0       1         2        3       4       5       6
        String[] words = {"java", "code", "python", "code", "rust", "code", "rust"};    //java, python
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words) {
        for (int i = 0; i < words.length; i++) {
            int num = 0;
            for (int j = 0; j < words.length; j++) {
                if (words[j].equals(words[i])) {
                    num++;
                }
            }
                if(num == 1){
                    System.out.println(words[i]);

            }
        }
    }
}