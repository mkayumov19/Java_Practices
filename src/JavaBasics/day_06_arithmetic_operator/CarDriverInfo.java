package JavaBasics.day_06_arithmetic_operator;

public class CarDriverInfo {
    public static void main(String[] args){

        String carModel = "Lexus RX350";
        String driverName = "Max";
        String licenseNumber = "ABC-123";
        short speed = 240;
        boolean isAutomatic = true;
        char licClass = 'A';
       String scream = "AAAAA";

        System.out.println("Car model: \t\t\t\t"+carModel);
        System.out.println("Driver's name: \t\t\t"+driverName);
        System.out.println("License number: \t\t"+licenseNumber);
        System.out.println("Maximum speed: \t\t\t"+speed);
        System.out.println("Has automatic gear: \t"+isAutomatic);
        System.out.println("Driver's license class: "+licClass);
        System.out.println(driverName+" is driving "+carModel+" with license class "+licClass+" at speed: "+speed+
            " with fake plate humber: "+licenseNumber+" and passenger is screaming: "+licClass+scream);
        System.out.println(licClass+" "+licClass);
        System.out.println(licClass+"  "+speed);
        System.out.println(10+5);
        System.out.println(isAutomatic+" "+isAutomatic);

    }

}
