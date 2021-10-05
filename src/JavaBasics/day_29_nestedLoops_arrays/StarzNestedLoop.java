package JavaBasics.day_29_nestedLoops_arrays;

public class StarzNestedLoop {
    public static void main(String[] args) {

        for(int outer = 1; outer <= 5; outer++){

            for (int inner = 1; inner <= 20; inner++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int outer = 1; outer <= 10; outer++){
            for (int inner = 1; inner <= outer; inner++){
                System.out.print("* ");
            }
            System.out.println();
        }
//  ============================================================================================================
        for (int outer = 1; outer <= 10; outer++){
            for (int inner = 10; inner >= outer; inner--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
