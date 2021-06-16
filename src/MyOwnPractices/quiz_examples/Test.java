package MyOwnPractices.quiz_examples;

public class Test {

    static String name = "John";
    static String id = "123";       //if this is not static, println would not read this line.

    public static void main(String[] args) {

        System.out.println(name);           //John
        System.out.println(id+1);           //1231          ...if id was not static = ERROR.
    }
}
