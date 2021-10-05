package myOwnPractices.replPractise;

public class At3rdChar {
    public static void main(String[] args) {
        System.out.println(at3("longword","foo"));
    }

    public static String at3(String target,String word){
        String newWord = "";
        newWord = target.substring(0,3)+word+target.substring(3);
        return newWord;
    }
}
/*
at3 accepts two strings and returns a string.
The first string is the one that will be manipulated. At the 3rd char position of target you will insert the word argument.
Example:
at3("longword","foo")
return: "lonfoogword"
at3("longword","foo")
return: "lonfoogword"
at3("blabla","a")
return: "blaabla"
 */