package JavaClasses.day_54_abstraction;

public class Pizza extends MenuItem{

    @Override
    public void prepare(){
        System.out.println("Stretch the dough, put toppings, cheese and bake!");
    }

    @Override
    public void serve(){
        System.out.println("Serve in X-Large pizza box!");
    }
}
