package JavaBasics.day_32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {

        String sentence = "java is fun";
        String[]words = sentence.split(" ");
        System.out.println("First word = "+ words[0]);
        System.out.println("First word = "+ words[1]);
        System.out.println("First word = "+ words[2]);
            for(String eachWord : words){
                System.out.print(eachWord);
            }
        String googleResult = "About 1,810,000 results (0.68 seconds)";
            String[] str = googleResult.split(" ");
        System.out.println("count = "+ str[1]);
        System.out.println("seconds = "+str[3].replace("(",""));
//        System.out.println("seconds = "+str[3].substring(1));



    }
}
