package JavaClasses.day_38_methods;

public class RecursiveMethod {
    public static void main(String[] args) {
    printNums(1);
    }

    public static void printNums(int nums){
        System.out.println(nums + " ");
        nums++;
        if(nums <= 100){
            printNums(nums);
        }
    }

}
