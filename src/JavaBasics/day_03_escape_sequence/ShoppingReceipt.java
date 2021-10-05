package JavaBasics.day_03_escape_sequence;

public class ShoppingReceipt {

    public static void main(String[] args) {

        System.out.println("***************************");
        System.out.println("      WELCOME TO GIANT");
        System.out.println("***************************");

        int Cake = 24;
        double Water= 3.99;
        double AppleJuice= 7.50;
        double Bread= 4.25;
        double Tax=3.90;

        System.out.println("Cake $"+Cake);
        System.out.println();
        System.out.println("Water $"+Water);
        System.out.println();
        System.out.println("AppleJuice $ "+AppleJuice);
        System.out.println();
        System.out.println("Bread $"+Bread);
        System.out.println();
        System.out.println("Tax $ "+Tax);
        System.out.println();

        System.out.print("Grand total: $");
        System.out.println(Cake+Water+AppleJuice+Bread+Tax);
        System.out.println("Thank you for shopping with us!");


    }
}
