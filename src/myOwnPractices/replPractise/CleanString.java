package myOwnPractices.replPractise;

public class CleanString {
    public static void main(String[] args) {

        System.out.println(clean("one two three","two"));
    }

    public static String clean (String text ,String badWord) {
            String cleanWord = "";
            if(text.contains(badWord)){
                cleanWord = text.replaceAll(badWord+" ","");

            }
        return cleanWord;
    }
}

