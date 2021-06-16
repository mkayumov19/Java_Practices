package MyOwnPractices.quiz_examples;

public class Test3 {
    static int a;
    int b;

    public static void main(String[] args) {
        Test3 obj1 = new Test3();
        obj1.b = 10;
        obj1.a = 20;

        Test3 obj2 = new Test3();
        obj2.b = 30;
        obj2.a = 40;

        System.out.println(obj1.a + " " + obj1.b);
        System.out.println(obj2.a + " " + obj2.b);
    }
}
