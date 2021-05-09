package MyOwnPractices.replitTasks;
import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter any word");
//        String word = scan.next();
//        System.out.println(word.charAt(0)+""+word.charAt(word.length()-1));
////    ================================================================================
//        int wordLength = word.length();
//        if (wordLength % 2 != 0) {
//               if (wordLength >= 3) {
//                System.out.println(word.charAt(wordLength / 2));
//             } else if (wordLength == 1) {
//                System.out.println("" + word.charAt(0) + word.charAt(0) + word.charAt(0));
//             }
//        }else if (wordLength % 2 == 0){
//               if (wordLength >= 4){
//                   String fourOrLarger = "" + word.charAt((wordLength/2)-1) + word.charAt(wordLength/2);
//                    System.out.println(fourOrLarger);
//               }else if(wordLength == 2){
//                   String twoExact = "" + word.charAt(0)+word.charAt(1)+word.charAt(0)+word.charAt(1);
//                   System.out.println(twoExact);
//            }
//        }
////  ====================================================================================================================================
//        String word1 = scan.next();
//        String word2 = scan.next();
//        int word11 = word1.length();
//        int word22 = word2.length();
//        if(word11 == 3 && word22 == 3){
//            String merger = "" + word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2);
//            System.out.println(merger);
//        } else if (word11 != 3 || word22 != 3){
//            System.out.println("cannot merge");
//        }
////  ======================================================================================================================================
//        String worda = scan.next();
//        int midWord = worda.length() / 2;
//        System.out.println(worda.substring(0,midWord)+worda.substring(0,midWord));
//  ======================================================================================================================================

        String word12 = "vvv";
        if (word12.length() % 2 != 0){
            if(word12.length() >= 5){
                System.out.println(word12.substring(word12.length() / 2-1,word12.length()/2+2));
            }else{
                System.out.println("invalid");
            }
        }else{
            System.out.println("invalid");
        }
//    ======================================================================================================================================


    }
}












