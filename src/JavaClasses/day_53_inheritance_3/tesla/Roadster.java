package JavaClasses.day_53_inheritance_3.tesla;

public class Roadster extends ElectricCar {

    public Roadster(String model, double price, int year, int range) {
        super("Tesla", "Roadster", 200000, 2022, 620);
        System.out.println("Welcome new Roadster!");


    }
}
