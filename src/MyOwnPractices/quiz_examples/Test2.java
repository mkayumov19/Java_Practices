package MyOwnPractices.quiz_examples;

public class Test2 {

    static int nums = 10;

    public static void main(String[] args) {

        Test2 obj1 = new Test2();
        obj1.nums = 20;
        nums = 30;

        Test2 obj2 = new Test2();

        System.out.println(obj2.nums);      //30
        System.out.println(nums);           //30

    }
}
