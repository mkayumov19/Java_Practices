package JavaBasics.day_50_inheritance_overriding;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "John";
        p1.age = 35;

        p1.talk();
        p1.walk();
        p1.work("SDET");

        //instead Creating Object class of Teacher, we are Extending:
        Teacher t1 = new Teacher();
        t1.teacherID = 1234;
        t1.name = "Mike";
        t1.age = 28;
        t1.talk();
        t1.walk();
        t1.work("Dev");

        Teacher t2 = new Teacher();
        t2.teach("Java");

        Student s1 = new Student();
        s1.studentID = 34566;
        s1.name = "Jack";
        s1.age = 20;
        s1.talk();
        s1.walk();
        s1.work("Dev");
        s1.school = "Cybertek";
        s1.study("Selenium");


    }
}
