package JavaClasses.day_45_oop;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee myCoffee = new Coffee();
        System.out.println("Coffee amount: " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println(("After refill: " + myCoffee.getAmount()));
        myCoffee.drink(50);
        System.out.println(("After drinking: " + myCoffee.getAmount()));

        myCoffee.setType("Turkish coffee");
        System.out.println("My coffee = " + myCoffee.getType());
        System.out.println(myCoffee.toString());

    }
}
