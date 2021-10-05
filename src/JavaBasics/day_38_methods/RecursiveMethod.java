package JavaBasics.day_38_methods;

public class RecursiveMethod {
    public static void main(String[] args) {
        printNums(0);
    }

    public static void printNums(int nums) {
        System.out.println(nums + " ");
        nums++;
        if (nums <= 100) {
            printNums(nums);
        }
    }
}

//========================================================================================

////   ANOTHER WAY:
//    static int nums = 0;               //making nums static and accessible globally
//    public static void main(String[] args) {
//    printNums();
//    }
//    public static void printNums() {
//        System.out.println(nums + " ");
//        nums++;
//        if (nums <= 100) {
//         printNums();
//        }
//     }
//  }

