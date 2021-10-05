package myOwnPractices.replPractise;

public class CountEvens {
    public static void main(String[] args) {
        int[] nums = {4, 7, 10, 5, 16};
        int countEven=0;
        for (int each : nums) {
            if(each%2==0){
                countEven++;
            }
        }
        System.out.println("Even "+ countEven );

    }
}
