package MyOwnPractices.replitTasks;

import java.util.Arrays;

public class ZombieAttack1 {
    public static void main(String[] args) {

        int[] inhabitants ={3,6,0,4,3,2,7,1};
        int day=0;
        int alive;
        do {
            System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));
            alive = 0;
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] = inhabitants[i] / 2;
                alive += inhabitants[i];
                }
            }
            while (alive > 0) ;
            System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants) + "\n---- EXTINCT ----");
    }
}
