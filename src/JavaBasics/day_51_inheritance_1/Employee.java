package JavaBasics.day_51_inheritance_1;

public class Employee {
    String jobTitle;
    public double calculateSalary(double hourlyRate){

        return 52 * 40 * hourlyRate * 1.1;

    }

    // Overriding toString method in OBJECT class.
    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
