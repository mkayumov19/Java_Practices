package MyOwnPractices.replitTasks.person1;

public class PersonOneRunner {
    public static void main(String[] args) {

    Person person = new Person();
    System.out.println(person.getFirstName());
    System.out.println(person.getAge());
    person.setAge(20);
    System.out.println(person.getAge());

    Person person2 = new Person("James", "Bond", 45);
    System.out.println(person2.getLastName());
    System.out.println(person2.toString());

    }
}
