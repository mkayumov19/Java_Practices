package JavaClasses.day_44_custom_classes;

public class AnimalObject {
    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println(animal.type);

        animal.eat();
        animal.eat("grass");
        animal.speak();

        Animal cheetahObj = new Animal();
        String cheetah = "Cheetah";
        cheetahObj.type = cheetah;
        System.out.println(cheetah);

    }
}
