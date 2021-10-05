package myOwnPractices.replPractise;

public class FindNonDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 3, 4};
          int nonDup = 0;
          int count = 0;
        for(int i = 0; i < nums.length; i++){
              count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 1){
                nonDup = nums[i];
            }
        }
        System.out.println(nonDup);
    }
}
