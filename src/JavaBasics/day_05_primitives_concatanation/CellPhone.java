package JavaBasics.day_05_primitives_concatanation;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Apple";
        String model = "Iphone 12";
        String color = "Graphite";
        double price = 1299.99;
        int storage = 256;
        boolean hasCamera = true;

        System.out.println("Thank you for purchasing: " + brand);
        System.out.println(model);
        System.out.println(color);
        System.out.println("$" + price);
        System.out.println(storage + "GB");
        System.out.println("Iphone has best Camera, " + hasCamera + "\n");

        System.out.println("Brand is \t\t\t" + brand);
        System.out.println("Model is \t\t\t" + model);
        System.out.println("Phone color is \t\t" + color);
        System.out.println("Price is \t\t\t" + "$" + price);
        System.out.println("Phone storage \t\t" + storage + "GB");

        if (hasCamera) {
            int pixelCamera = 12;
            System.out.println("Phone has Camera \t" + pixelCamera + "MP");
        }else {
            System.out.println("Your Phone does not have Camera");
        }

    }
}

