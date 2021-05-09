package JavaClasses.day_34_void_methods;

public class StartCar {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("How to drive cheap Car?");
        Thread.sleep(3000);
        sitInTheCar();
        Thread.sleep(3000);
        startTheCar();
        Thread.sleep(3000);
        shiftToDrive();
        Thread.sleep(3000);
        moveTheCar();
    }
    public static void sitInTheCar(){
        System.out.println("1. Open the door and sit in driver's seat");
    }
    public static void startTheCar(){
        System.out.println("2. Insert key to ignition and turn clockwise");
    }
    public static void shiftToDrive(){
        System.out.println("3. While pushing break pedal, change gears to Drive mode");
    }
    public static void moveTheCar(){
        System.out.println("4. Release Break and slowly push on Gas pedal and hold Steering wheel!");
    }

}
