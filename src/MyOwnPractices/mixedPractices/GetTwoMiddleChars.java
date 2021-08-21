package MyOwnPractices.mixedPractices;

public class GetTwoMiddleChars {
    public static void main(String[] args) {
        String str = "makhmudjon";
       printMiddleCharacter(str);
    }

    public static String printMiddleCharacter(String str){
        if (str.length() % 2 == 1){
            System.out.println(str.charAt(str.length()/2));
            System.out.println(str.substring(str.length()/2 + 1));
        }else {
            int index = str.length() / 2;
            System.out.println(str.charAt(index-1) +""+ str.charAt(index));
//            System.out.println(str.substring(index-1, index+1));
        }

        return str;
    }
}