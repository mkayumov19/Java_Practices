package OfficeHours.Practice_06_01;
import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    String productOwner;
    String scrumMaster;
    String businessAnalyst;
    ArrayList<Tester> allTesters;
    ArrayList<Developer> allDevelopers;
    int sprintNumber;

    public ScrumTeam(String productOwner, String scrumMaster, String businessAnalyst) {
        this.productOwner = productOwner;
        this.scrumMaster = scrumMaster;
        this.businessAnalyst = businessAnalyst;
        this.allTesters = new ArrayList<>();
        this.allDevelopers = new ArrayList<>();
    }

    public void addTester(Tester tester){
        this.allTesters.add(tester);
    }
    public void addTester(Tester ... testers){ // Tester [] testers
        this.allTesters.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        this.allDevelopers.add(developer);
    }
    public void addDeveloper(Developer ... developer){
        this.allDevelopers.addAll(Arrays.asList(developer));
    }

    public static void main(String[] args) {
        ScrumTeam scrumTeam = new ScrumTeam("Ziba", "John", "Fikret");
        System.out.println(scrumTeam.allTesters);
        Tester tester1 = new Tester("Maxim", 10, "SDET", 1000000);
        scrumTeam.addTester(tester1);
        scrumTeam.addTester(new Tester("Anna", 11, "SDET", 10000000));
        System.out.println(scrumTeam.allTesters);

        scrumTeam.addDeveloper(new Developer("Anton", 1, "dev", 10000000));
        System.out.println(scrumTeam.allDevelopers);

    }
}