package MyOwnPractices.saimstasks;

public class GradeLevel {
    public static void main(String[] args) {
        byte gradeLevel = 5;
        if (gradeLevel >= 1 && gradeLevel <= 5) {
            System.out.println(gradeLevel + " is Elementary School grade level");
        } else if (gradeLevel >= 6 && gradeLevel <= 8) {
            System.out.println(gradeLevel + " is Middle School grade level");
        } else if (gradeLevel >= 9 && gradeLevel <= 12) {
            System.out.println(gradeLevel + " is High School grade level");
        } else if (gradeLevel >= 13 && gradeLevel <= 16) {
            System.out.println(gradeLevel + " is College grade level");
        } else if (gradeLevel >= 17 && gradeLevel <= 18) {
            System.out.println(gradeLevel + " is Grad School grade level");
        } else {
            System.out.println("Invalid grade level given");
        }
    }
}
