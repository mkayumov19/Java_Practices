package JavaBasics.day_46_encapsulation;

public class Dealership {
    public static void main(String[] args) {

        Car car1 = new Car();
//      ERROR below as model,year, mileage are Private in Car class.
//        car1.model = "Toyota Camry";
//        car1.year = 2014;
//        car1.mileage = 280000;

        car1.setModel("Toyota Camry");
        System.out.println(car1.getModel());

        car1.setYear(2014);
        System.out.println(car1.getYear());

        car1.setMileage(280000);
        System.out.println(car1.getMileage());
        System.out.println(car1.mileageToString()+20);
        System.out.println(car1);

    }
}
