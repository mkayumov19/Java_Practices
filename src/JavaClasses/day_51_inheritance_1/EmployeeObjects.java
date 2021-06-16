package JavaClasses.day_51_inheritance_1;

public class EmployeeObjects {
    public static void main(String[] args){

        Employee developer = new Employee();
        developer.jobTitle = "Java Developer";
        double annualDevSalary = developer.calculateSalary(55.0);
        System.out.println("Full-time Developers annual salary = " + Math.round(annualDevSalary));
        //Math.round removes ".00" including .dot

        Contractor contractor = new Contractor();
        contractor.jobTitle = "SDET";
        double annualContractorSalary = contractor.calculateSalary(65.0);
        System.out.println("Contractors annual salary = " + Math.floor(annualContractorSalary));
        //Math.floor leaves .0 and removes rest of long decimal part.

        System.out.println(developer.toString());
        System.out.println(contractor.toString());

    }
}
