package MyOwnPractices.mixedPractices;
import java.util.Scanner;
public class BlackJack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();
        if (player > 21){
            System.out.println("player win");
        } else if (house > player){
            System.out.println("player loss");
        } else if (player == house){
            System.out.println("its a tie");
        } else if (player > house){
            System.out.println("player win");
        }
    }
}
