package MyOwnPractices.mixedPractices;

public class Computer {

    public static void main(String[] args) {

        String brand = "Apple", osVersion = "MacOS Big Sur", processor = "Intel Core I7",
        description = "Apple MacBook PRO with Touch ID and Touch Panel", color = "Silver";
        int ramMemory = 16, numberOfMonitors = 1, numberOfUsbSlots = 4;
        double storageMemory = 250.69, versionNumber = 11.0, price = 2399.99;
        boolean hasMonitor = true, hasWifiCard = true, hasUsb3 = false;
        char usbType = 'C';

        System.out.println("================ About this Mac ==============");
        System.out.println("This is \""+description+"\" with below specifications:");
        System.out.println("Brand: "+brand+"\nOS Version: "+osVersion+" "+versionNumber+"\nProcessor: "+processor);
        System.out.println("Ram memory: "+ramMemory+" GB LPDDR3\nStorage Memory: SSD "+storageMemory+" GB");
        System.out.println("It has "+numberOfMonitors+" monitor, "+numberOfUsbSlots+" Usb slots type "+usbType);
        System.out.println("Includes: \nMonitor \t - "+hasMonitor+"\nWifi Card: \t - "+hasWifiCard+
                        "\nUsb 3: \t\t - "+hasUsb3);
        System.out.println("Available color: "+color+"\nPrice: $"+price);
    }
}
