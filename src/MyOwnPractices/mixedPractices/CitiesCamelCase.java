package MyOwnPractices.mixedPractices;

import com.sun.javafx.binding.StringFormatter;

public class CitiesCamelCase {

    public static void main(String[] args) {
        String sentence = "los angeles   ";
        String words[]=sentence.split(" ");
        String capitalizeWord="";

        for(String each : words){
            String first = each.substring(0,1);
            String afterfirst = each.substring(1);
            capitalizeWord+=first.toUpperCase()+afterfirst+" ";
        }

        System.out.println(capitalizeWord);
    }

}


//    String camelWord = "";
//    String words[] = in.split(" ");
//		for (String each : words) {
//                String firstPart = each.substring(0, 1);
//                String secondPart = each.substring(1);
//                camelWord += firstPart.toUpperCase() + secondPart + " ";
//                }
//                return camelWord.trim();
////		return null;