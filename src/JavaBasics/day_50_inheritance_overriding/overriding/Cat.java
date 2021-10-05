package JavaBasics.day_50_inheritance_overriding.overriding;

public class Cat extends Animal {



    public void jump() {
        System.out.println("Cat can jump");
    }

    @Override
    public void speak(){
        System.out.println("Cat says Meow...");
        //speak method already in Parent class. Here we're overriding it
    }
}
