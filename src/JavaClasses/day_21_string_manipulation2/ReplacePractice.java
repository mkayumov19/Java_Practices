package JavaClasses.day_21_string_manipulation2;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.replace("hub","lab"));
        word = word.replace("hub","lab");
        System.out.println(word);
        System.out.println(word.replace("i","o").replace("o","a"));
//=============================================================================================================
        String sentence = "java is fun";
        sentence = sentence.replace(" ","");
        System.out.println(sentence);
        sentence = sentence.replace("java","selenium").replace("fun","a lot of fun");
        System.out.println(sentence);

        String result = "1-48 of over 4,000 results for \"java book\"";
        result = result.replace("1-48 of over ","")
                       .replace(" results for \"java book\"","")
                       .replace(",","");
        System.out.println("result is: " + result);

        String print = "         Hello how are you my dear friend.       ";
        print = print.trim();
        System.out.println(print);

    }
}
