package MyOwnPractices.replitTasks;

public class FindMax {
    public static void main(String[] args) {
        int[] nums = {82,27,9,33,19,48,73,26};
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}
