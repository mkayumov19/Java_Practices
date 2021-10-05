package JavaBasics.day_55_abstraction.exercise_example;

/**
 non-abstract child is considered to be Concrete
 */
public class Swimming extends Exercise{

    /**
     * Abstract Methods of Parent abstract class MUST be overridden.
     */
    @Override
    public void perform() {
        System.out.println("Then swimming in a pool");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 11;
    }
}
