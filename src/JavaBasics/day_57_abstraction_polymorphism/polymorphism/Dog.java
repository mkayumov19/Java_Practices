package JavaBasics.day_57_abstraction_polymorphism.polymorphism;

public class Dog extends Animal{

    @Override
    public void makeNoise(){
        System.out.println("Dog is barking: <Gav-Gav>, <Woof-Woof>");
    }

}
