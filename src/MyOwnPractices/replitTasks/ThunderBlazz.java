package MyOwnPractices.replitTasks;

import java.util.Scanner;

public class ThunderBlazz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(getThunderBlazz(in.nextBoolean(), in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
    }

    public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1
            , int ingredient2, int ingredient3) {

        // your code here
        if (available == true || gift == true || (ingredient1 == 1 && ingredient2 == 2 && ingredient3 == 3)
                || ingredient1 == 3 && ingredient2 == 1 && ingredient3 == 2) {
            return true;
        } else {
            return false;
        }
    }
}
