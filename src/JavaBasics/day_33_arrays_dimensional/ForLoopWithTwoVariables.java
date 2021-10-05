package JavaBasics.day_33_arrays_dimensional;

public class ForLoopWithTwoVariables {
    public static void main(String[] args) {
        for(int i = 1, j = 4; i <= 4; i++, j--){
            System.out.println("| \uD83D\uDE97 |  " + i + "\t| \uD83D\uDE94 |  " + j);
        }
//        =====================================================================================
        for(int i = 1, j = 1; i <= 4; i++, j++) {
            System.out.println("i = " + i + ", j = " + j);
        }
//        =====================================================================================
        System.out.println("--------2 way for loop------");
        for(int i = 1, j = 5; j >= 0; i++, j--) {
            System.out.println("i = " + i + ", j = " + j);
        }

    }
}
