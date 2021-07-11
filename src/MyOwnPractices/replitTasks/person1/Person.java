package MyOwnPractices.replitTasks.person1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(){
        String firstName = "undefined";
        String lastName = "undefined";
        int age = -1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        firstName = firstName;
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        this.lastName = lastName;
        return this.lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.firstName + " | " + this.lastName + " | " + this.age;

    }
}
