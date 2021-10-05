package JavaBasics.day_55_abstraction.exercise_example;

public abstract class Exercise {

    public void start(){                  // ---> non-abstract method
        System.out.println("Warming up and starting daily exercise");
    }

    //-abstract method - method without body/implementation, just signature
    //-purpose: letting sub-classes implement/override their own way
    public abstract void perform();

    //another abstract method that concrete sub-classes will override/implement
    public abstract int getCaloriesCount(int minutes);

    public void repeat(){
        System.out.println("Repeating ");
    }

}
