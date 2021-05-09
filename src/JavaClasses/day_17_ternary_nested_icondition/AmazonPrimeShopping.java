package JavaClasses.day_17_ternary_nested_icondition;

public class AmazonPrimeShopping {
    public static void main(String[] args) {
        int itemPrice = 20;
        boolean isPrimeMember = false;
        if (isPrimeMember) {
            System.out.println("Eligible for free 2 day shipping");
        } else {
            if (itemPrice >= 25) {
                System.out.println("Eligible for free regular shipping");
            } else {
                System.out.println("No eligible free shipping for orders under $25.");
            }
        }
    }
}
