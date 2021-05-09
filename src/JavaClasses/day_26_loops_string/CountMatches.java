package JavaClasses.day_26_loops_string;

public class CountMatches {
    public static void main(String[] args) {
        String word = "java";
        char letter = 'v';
        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == letter){
                count++;
            }
        }
        System.out.println("There are "+ count + " " + letter +" letter(s) in " + word);
    }
}
