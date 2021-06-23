package JavaClasses.day_55_abstraction.exercise_example;


// non-abstract child is considered to be Concrete
public class Running extends Exercise {

    // Abstract Methods of Parent abstract class MUST be overridden.
    @Override
    public void perform() {
        System.out.println("Performing Running exercise");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 13;

    }

}
