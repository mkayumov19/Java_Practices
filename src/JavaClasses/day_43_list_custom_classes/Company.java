package JavaClasses.day_43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.jobTitle = "DEVOPS";
        employee1.name = "Clara";
        employee1.work();

        Employee emp2 = new Employee();
        emp2.name = "Jackson";
        emp2.jobTitle = "Programmer";
        emp2.work();

        employee1.work();

    }
}
