package MyOwnPractices.replitTasks;

import java.util.Arrays;

public class ZombieAttack2 {
    public static void main(String[] args) {
        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};
        int day = 0;
        int sum = 0;

        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

        while (true) {
            for (int i = 0; i < inhabitants.length; i++) {
                sum = 0;
                if (inhabitants[i] == 0) {
                    if (i == 0) {
                        continue;
                    } else if (i == inhabitants.length - 1) {
                        inhabitants[i - 1] /= 2;
                    } else {
                        if (inhabitants[i - 1] > 0) {
                            inhabitants[i - 1] /= 2;
                        }
                        if (inhabitants[i + 1] > 0) {
                            inhabitants[i + 1] /= 2;
                            i++;
                        }
                    }
                }
            }
            day++;
            System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

            for (int each : inhabitants) {
                sum += each;
            }

            if (sum == 0) {
                System.out.println("---- EXTINCT ----");
                break;
            }
        }
    }
}
