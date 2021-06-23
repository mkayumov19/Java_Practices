package JavaClasses.day_55_abstraction.exercise_example;

public class FreeWeighs extends Lifting{

    @Override
    public void endLift() {
        System.out.println("Then lifting free-weight dumbbells");
    }
    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 6;
    }

    @Override
    public void perform() {
        System.out.println("At the end carefully re-rack dumbbells");
    }


}
