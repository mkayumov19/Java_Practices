package JavaClasses.day_44_custom_classes;

public class Animal {
    String type = "Panda";
    public void eat() {
        System.out.println("eating");
    }

    public void eat(String food){
        System.out.println("Eating " + food);
    }

    public void speak() {
        System.out.println("singing");
    }

}
