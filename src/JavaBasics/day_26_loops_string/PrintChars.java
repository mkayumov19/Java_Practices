package JavaBasics.day_26_loops_string;

public class PrintChars {
    public static void main(String[] args) {

        String word = "Makhmudjon";
        for (int i = 0; i < word.length(); i++){
            System.out.println(i+ "-"+ word.toUpperCase().charAt(i) + " ");
        }
        String name = "Makhmudjon";
        for(int i = name.length()-1; i >= 0; i--){
            System.out.print(name.toUpperCase().charAt(i) + " ");
        }
    }
}
