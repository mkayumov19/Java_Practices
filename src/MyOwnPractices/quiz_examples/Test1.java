package MyOwnPractices.quiz_examples;

public class Test1 {

    int num = 10;

    public static void main(String[] args) {

        Test1 obj1 = new Test1();
        obj1.num = 20;

        Test1 obj2 = new Test1();
        System.out.println(obj2.num);       //10

    }
}
