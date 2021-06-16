package JavaClasses.day_51_inheritance_1;

public class Contractor extends Employee {


    //1) lets everyone know it's overriding
    //2) ensures that this method is overridden. If not if shows ERROR.
    @Override
    public double calculateSalary(double hourlyRate) {
        return 50 * 40 * hourlyRate;

    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}