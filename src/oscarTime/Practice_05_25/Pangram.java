package oscarTime.Practice_05_25;

public class Pangram {
    /*
    Pangram is Sentence including all letters in Alphabet.
    below we are checking and removing all letters if contains in abc.
     */
    public static void main(String[] args) {
        String s = "A quick brown fox jumps over the lazy dog";
        System.out.println("" + isPangram(s));
    }

    public static boolean isPangram(String str){
        str = str.toLowerCase();
        String alp = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))){
                alp = alp.replace("" + str.charAt(i), "");
            }
            if (alp.isEmpty()){
                break;
            }
        }
        return alp.isEmpty();
    }
}
