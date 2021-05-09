package JavaClasses.day_29_nestedLoops_arrays;

public class NestedForLoop {
    public static void main(String[] args) throws InterruptedException {

        for (int minutes = 1; minutes <= 10; minutes++){
            System.out.println("\nMinutes = " + minutes);
            for(int seconds = 0; seconds < 60; seconds++){
                System.out.print(seconds + ",");
            }
        }
//  ===========================================================================================================
        for (int minutes = 0; minutes <= 4; minutes++){
            for (int seconds = 0; seconds < 60; seconds++){
                System.out.println(minutes +":"+ seconds);
//                Thread.sleep(1000);                     // in debug mode it works and slows down as well
            }
        }
//  ===========================================================================================================

    }
}
