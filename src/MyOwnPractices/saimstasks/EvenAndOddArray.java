package MyOwnPractices.saimstasks;

public class EvenAndOddArray {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8,9,10};
        int even = 0;
        int odd = 0;
        for (int i = nums[0]; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                even = i;
            }else{
                odd = i;
            }
        }
        System.out.println(nums[even] + "Even number");
        System.out.println(nums[odd] + "Odd number");
    }
}
