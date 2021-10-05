package myOwnPractices.advancedTasks;

public class CharValueUpperOrLowerCase {
    public static void main(String[] args) {

        char letter = 'm';
        if (letter >= 'a' && letter <= 'z'){
            System.out.println(letter + " is lowercase letter");
        }else if(letter >= 'A' && letter <= 'Z'){
            System.out.println(letter + " is uppercase letter");
        }else{
            System.out.println(letter + " is not a letter");
        }
    }
}
