package JavaClasses.day_16_switch_ternary_continue;

public class AdaireApartments {
    public static void main(String[] args) {

        int numberOfBedrooms = 3;
        double startingPrice = 0.00;
        System.out.println("####-Welcome to Parvin's Apartment-####");
        switch (numberOfBedrooms) {
            case 0:
                startingPrice = 1454.0;
                System.out.println("Studio apartment selected.");
                break;
            case 1:
                startingPrice = 1750.0;
                System.out.println("1 Bedroom apartment selected.");
                break;
            case 3:
                startingPrice = 2899.0;
                System.out.println("2 bedroom apartment selected.");
                break;
            case 4:
                startingPrice = 3500.0;
                System.out.println("3 bedroom apartment is selected.");
            default:
                System.out.println(numberOfBedrooms + " bedroom currently unavailable.");
//          return;     ------------->>>>>>>>>>> stops here and exits Method.
        }
        System.out.println("Starting prise is: $" + startingPrice);
    }
}
