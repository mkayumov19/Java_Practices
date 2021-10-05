package JavaBasics.day_55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {

//      Exercise exercise = new Exercise();      //--->  Cannot create Object from Abstract class!
        Exercise exercise = new Running();       //--->  POLYMORPHISM. We can create Object from nonAbstract sub-classes of Abstract class
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeighs  freeWeighs = new FreeWeighs();

        exercise.start();
        exercise.perform();
        System.out.println("Exercising 30 minutes - calories lost = " + exercise.getCaloriesCount(40));
        System.out.println();

//        running.start();
        exercise.repeat();
        running.perform();
        System.out.println("Running 30 minutes - calories lost = " + running.getCaloriesCount(30));
        System.out.println();

//        swimming.start();
        swimming.perform();
        System.out.println("Swimming 30 minutes - calories lost = " + swimming.getCaloriesCount(25));
        System.out.println();

//        freeWeighs.start();
        freeWeighs.endLift();
        System.out.println("Lifting 30 minutes - calories lost = " + freeWeighs.getCaloriesCount(25));
        freeWeighs.perform();

    }

}
