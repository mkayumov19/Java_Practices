package JavaBasics.day_59_polymorphism_exceptions.exception_handling;

public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);
            System.out.println(10 / 0);
            System.out.println(10 / 3);
        } catch(Exception ex){
            System.out.println("RunTimeException happened and handled" + ex.getMessage());
        }
        System.out.println("After first try catch");

        int[] nums = {11, 33, 44};
       try {
           System.out.println(nums[0]);
           System.out.println(nums[3]);
           System.out.println(nums[1]);

       } catch (ArrayIndexOutOfBoundsException exp){
           System.out.println("Error happened and Handled");
       }
        System.out.println("After array code");
    }
}
