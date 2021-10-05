package JavaBasics.day_58_polymorphism;

public class Amazon extends OnlineShop implements Prime{


    @Override
    public void primeShipping() {
        System.out.println("2-day shipping for amazon prime members");
    }

    @Override
    public void buy() {
        System.out.println("Buying items online");
    }

    @Override
    public void sell() {
        System.out.println("Selling items online");
    }
}
