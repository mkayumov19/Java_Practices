package JavaClasses.day_58_polymorphism;

public abstract class OnlineShop {

    public abstract void buy();

    public abstract void sell();

    public void ship(){
        System.out.println("Shipping the purchased items");
    }

}
