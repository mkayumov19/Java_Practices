package JavaClasses.day_53_inheritance_3.tesla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar ec1 = new ElectricCar("Tesla", "Model-Y", 48190.0, 2021, 326);
        ec1.drive(50);
        System.out.println(ec1.toString());
//        System.out.println(ec1.make);             //ERROR: make is private, its not visible here
//        System.out.println(ElectricCar.make);     //Error: make needs to be public static
        System.out.println("ec1 make: " + ec1.getMake());
        System.out.println("ec1 model: " + ec1.getModel());
        System.out.println("ec1 price: " + ec1.getPrice());
        System.out.println("ec1 range(after driven miles): " + ec1.getRange());
        System.out.println("ec1 year: " + ec1.getYear());

        if (ec1.getPrice() > 10000){
            System.out.println(ec1.getMake() +" "+ ec1.getModel() + " at price " + ec1.getPrice()+ " out of my budget");
        } else {
            System.out.println("I can buy this Electric car");
        }

        System.out.println("Count: " + ElectricCar.getCount());
        System.out.println("--------------------------------------------------------");

        ElectricCar ec2 = new ElectricCar("Tesla", "CyberTruck", 59900, 2022, 300);
        System.out.println(ec2.toString());
        System.out.println("Count = " + ec2.getCount()); //call static method using object
        System.out.println("Count = " + ElectricCar.getCount());//call static method using Classname

        ElectricCar roadster = new ElectricCar("Tesla", "Roadster", 120000, 2022, 620);
        System.out.println(roadster.toString());
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println("Range remaining: " + roadster.getRange());
        System.out.println("Count: " + roadster.getCount());

        ElectricCar modelS = new ElectricCar("Tesla", "ModelS", 89990.0, 2021, 405);
        System.out.println(modelS.toString());
        modelS.drive(500);
        modelS.drive(15);
        System.out.println("Range remaining: " + modelS.getRange());
        System.out.println("Count: " + ElectricCar.getCount());

    }
}
