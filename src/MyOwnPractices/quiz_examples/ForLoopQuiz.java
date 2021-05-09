package MyOwnPractices.quiz_examples;

import java.util.Scanner;

public class ForLoopQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//    for (int i = 0; i < 5; i--){
//        System.out.println("Kello");
//    }
        int z = 5;
    for(int i = 5; i > 0; i--){
        z += i;
    }
        System.out.println(z);

        int a = 0;
        while (a <= 6){
            a += 2;
        }
        System.out.println(a);
    }
}
