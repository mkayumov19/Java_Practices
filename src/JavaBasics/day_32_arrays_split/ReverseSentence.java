package JavaBasics.day_32_arrays_split;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Today we have java class";
        String[] eachWord = sentence.split(" ");

        String reversed = "";
        for (int i = eachWord.length - 1; i >= 0; i--) {
            reversed += eachWord[i] + " ";
        }
        System.out.println("Original: " + sentence.trim());
        System.out.println("Reversed: " + reversed.trim());

//        System.out.println(eachWord[2]);
//        System.out.println(eachWord[1]);
//        System.out.println(eachWord[0]);

//        String word = "Java";
//        String[] letter = word.split("");
//        for (String reversed1 : letter) {
//            System.out.println(reversed1);
//        }
//        String word1 = "Selenium";
//        char[] Letters1 = word1.toCharArray();
//        for (String reversed2 : letter) {
//            System.out.print(reversed2);

//        }
    }
}
