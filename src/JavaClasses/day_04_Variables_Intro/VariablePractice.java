package JavaClasses.day_04_Variables_Intro;

public class VariablePractice {

    public static void main(String[] args){

        int Student;                 // declare ONCE
        Student = 400;               // assigning
        System.out.println(Student);

        Student = 500;               // reassigning
        System.out.println(Student);

        int teachers;
        teachers = 2;
        int mentors;
        mentors = 25;
        System.out.print("Number of teachers: \t");
        System.out.println(teachers);

        System.out.print("Number of mentors:\t\t");
        System.out.println(mentors);

        int director, driver, cook;      //declaring in the same line
        director = 1;
        driver =  2;
        cook = 4;
        System.out.println(director);

        int laptop = 2, macbook = 1, desktop = 3;
        System.out.println(laptop+","+macbook+","+desktop);


    }

}
