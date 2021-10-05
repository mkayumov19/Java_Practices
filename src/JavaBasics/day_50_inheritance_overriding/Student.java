package JavaBasics.day_50_inheritance_overriding;

public class Student extends Person{

    int studentID;
    String school;

    public void study(String topic) {
        System.out.println(name + " is a student");
        System.out.println(name + " is studying " + topic + " at " + school);

    }
}
