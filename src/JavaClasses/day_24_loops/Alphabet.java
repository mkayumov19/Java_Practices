package JavaClasses.day_24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';
        while (letter <= 'z') {
            System.out.print(letter + " ");
            letter++;
        }
        System.out.println();
        char letter2 = 'z';
        while(letter2 >= 'a'){
            System.out.print(letter2+" ");
            letter2--;
        }
    }
}
