package JavaClasses.day_61_exceptions_collections;

public class ElementaryStudent {
    private String name;
    private int age;
    String school;

    public ElementaryStudent() {
    }

    public ElementaryStudent(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 5 && age < 12) {
            this.age = age;
            this.school = "Elementary";
        } else if (age >= 12 && age < 15) {
            this.age = age;
            this.school = "Middle";
        } else if (age >= 15 && age < 18) {
            this.age = age;
            this.school = "High";
        }else{
            throw new IllegalArgumentException("This Age does not qualify for School");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
