package MyOwnPractices.mixedPractices;
import java.util.Scanner;
public class LaptopConfigurator {
    public static void main(String[] args) {
        double screenSize;
        int laptopPrice = 0, storageMemory, ramMemory;
        String cpuType, storageType, resolution;

        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size:");
        screenSize = scan.nextDouble();
        if (screenSize == 13.3) {
            laptopPrice = laptopPrice + 200;
        } else if (screenSize == 15.0) {
            laptopPrice = laptopPrice + 300;
        } else if (screenSize == 17.3) {
            laptopPrice = laptopPrice + 400;
        }
        System.out.println("Select CPU type:");
        cpuType = scan.next();
        if (cpuType.equals("i3")) {
            laptopPrice = laptopPrice + 150;
        } else if (cpuType.equals("i5")) {
            laptopPrice = laptopPrice + 250;
        } else if (cpuType.equals("i7")) {
            laptopPrice = laptopPrice + 350;
        }
        System.out.println("Select RAM size:");
        ramMemory = scan.nextInt();
        ramMemory = (ramMemory / 4) * 50;
        laptopPrice = ramMemory + laptopPrice;

        System.out.println("Select storage type:");
        storageType = scan.next();
        if (storageType.equals("HDD")) {
            System.out.println("Enter storage size:");
            storageMemory = scan.nextInt();
            storageMemory = (storageMemory / 500) * 50;
            laptopPrice = laptopPrice + storageMemory;
        } else if (storageType.equals("SSD")) {
            System.out.println("Enter storage size:");
            storageMemory = scan.nextInt();
            storageMemory = (storageMemory / 500) * 100;
            laptopPrice = laptopPrice + storageMemory;
        }
        System.out.println("Enter screen resolution:");
        resolution = scan.next();
        if (resolution.equals("FULLHD")){
            laptopPrice = laptopPrice + 100;
        }else if (resolution.equals("4K")) {
            laptopPrice = laptopPrice + 200;
        }
        System.out.println("Laptop price is: $"+laptopPrice);
    }
}