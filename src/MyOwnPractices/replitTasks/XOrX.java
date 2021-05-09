package MyOwnPractices.replitTasks;
import java.util.*;
public class XOrX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter word");
        String word = scan.next();

        if (word.startsWith("x") || word.startsWith("X")) {
            String xWord = word.substring(1);
            if(xWord.endsWith("x") || xWord.endsWith("X")){
                xWord = xWord.substring(0,xWord.length()-1);
            }
            System.out.println(xWord);
        } else if (word.endsWith("x") || word.endsWith("X")) {
            String wordX = word.substring(0,word.length()-1);
            if(wordX.startsWith("x") || wordX.startsWith("X")){
                wordX = wordX.substring(1);
            }
            System.out.println(wordX);
        }else if (!word.startsWith("x") || !word.startsWith("X")) {
            String noXWord = word;
            if (!noXWord.endsWith("x") || !noXWord.endsWith("X")) {
                System.out.println(noXWord);
            }
        } else if (!word.contains("x") && !word.contains("X")) {
            System.out.println(word);
        }
    }
}

//         if(word.length()>1){
//             if(word.startsWith("x")||word.startsWith("X")||word.endsWith("x")||word.endsWith("X")){
//                 if(word.startsWith("x")||word.startsWith("X")){
//                    word=word.substring(1);
//                 }
//                     if(word.endsWith("x")||word.endsWith("X")){
//                 word=word.substring(0,word.toLowerCase().lastIndexOf("x"));
//                 }
//                  System.out.println(word);
//              }else{
//                 System.out.println(word);
//                 }
//         }else{
//                 System.out.println(word);
//       }