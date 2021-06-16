package JavaClasses.day_51_inheritance_1.super_keyword;

public class LyftRides {
    public static void main(String[] args) {

        Lyft lyftRide = new Lyft();
        System.out.println("lyftRide = " + lyftRide.calculateRate(5.5));

        LyftXL xlRide = new LyftXL();
        System.out.println("xlRide = " + xlRide.calculateRate(5.5));

        Lux luxRide = new Lux();
        System.out.printf("luxRide = %f%n", luxRide.calculateRate(5.5));

    }
}
