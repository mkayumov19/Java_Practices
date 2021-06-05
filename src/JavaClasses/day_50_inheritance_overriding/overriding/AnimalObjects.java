package JavaClasses.day_50_inheritance_overriding.overriding;

public class AnimalObjects {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.name = "Bobik";
        animal.type = "BichonFrise";
        animal.speak();

        Cat cat = new Cat();
        cat.speak();

        Dog dog = new Dog();
        dog.speak();
    }
}
