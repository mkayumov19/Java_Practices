package JavaBasics.day_54_abstraction;

public class Salad extends MenuItem{

    @Override
    public void prepare(){
        System.out.println("Asking my wife to prepare me salad!");
    }

    @Override
    public void serve(){
        System.out.println("Say something nice to your wife and she will serve!");
    }
}
