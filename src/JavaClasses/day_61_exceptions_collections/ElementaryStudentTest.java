package JavaClasses.day_61_exceptions_collections;

import java.util.Stack;

public class ElementaryStudentTest {
    public static void main(String[] args) {
        try {
        ElementaryStudent el1 = new ElementaryStudent();
        el1.setName("Bob");
        el1.setAge(15);
            System.out.println("First student name = " + el1.getName());
            System.out.println("First student age = " + el1.getAge());
            System.out.println("Qualifies for " + el1.school + " school \n");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("This person should be in DayCare or at College or Working \n");
        }
         try {
            ElementaryStudent el2 = new ElementaryStudent("Anna", 7);
            System.out.println("Second student name: " + el2.getName());
            System.out.println("Second student age: " + el2.getAge());
            System.out.println("Qualifies for " + el2.school + " school");
        } catch (Exception er) {
            er.printStackTrace();
            System.out.println("Not school age person");
        }
    }

}
