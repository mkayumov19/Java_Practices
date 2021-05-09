package JavaClasses.day_29_nestedLoops_arrays;

public class ArraysWithNumbers {
    public static void main(String[] args) {
        int[] nums = new int[2];                    //{0,0} default value
        System.out.println(nums[0]);                // 0 because default value is always 0
        System.out.println(nums[1]);                // 0 because default value is always 0

        int[] counters = {5, 10, 20, (int)35.00, 40};
        double[] prices = {3.99, 5.50, 10.00};
        String[] cities = {"London", "Paris", "Andijan"};

        System.out.println("Counter = " + counters[1]);
        System.out.println("Price = " + prices[0]);
        System.out.println("City = " + cities[2]);


    }
}
