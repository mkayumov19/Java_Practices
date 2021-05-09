package JavaClasses.day_27_loops_practice;

public class Neighbor {
    public static void main(String[] args) {

        String word = "jjaavvaan";

        for (int index = 0; index < word.length()-1; index++){
            System.out.print(word.charAt(index));
            System.out.println(word.charAt(index+1));
            if (word.charAt(index) == word.charAt(index+1)){
                System.out.println("bibiiiip--->> " + word.charAt(index));
            }
        }

    }
}
