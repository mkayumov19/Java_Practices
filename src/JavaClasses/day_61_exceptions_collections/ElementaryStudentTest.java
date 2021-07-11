package JavaClasses.day_61_exceptions_collections;

import java.util.Stack;

public class ElementaryStudentTest {
    public static void main(String[] args) {
        try {
        ElementaryStudent el1 = new ElementaryStudent();
        el1.setName("Bob");
        el1.setAge(19);
            System.out.println("Student name = " + el1.getName());
            System.out.println("Student age = " + el1.getAge());
            System.out.println("Qualifies for " + el1.school + " school with that age");
        } catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("That age should be in DayCare or at College or Working");

    }

}
