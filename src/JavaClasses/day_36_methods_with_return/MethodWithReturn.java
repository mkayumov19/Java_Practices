package JavaClasses.day_36_methods_with_return;

public class MethodWithReturn {
    /**==================================================================*/
    public static void main(String[] args) {

        System.out.println("original score is: " + getCreditScore());
        int score = getCreditScore();
        System.out.println("new score is: " + score);
    }

/**------------Not Void/ Return Method--------------- */

        public static int getCreditScore(){
            return 800;
    }

}
