package MyOwnPractices.mixedPractices;

public class House {
    public static void main(String[] args){

        String houseType = "Single-family House";
        byte numOfBdrms = 5;
        double numOfBath = 3.5;
        int numOfKitchen = 2;
        short dining = 2;
        boolean basement = true;
        boolean attic = false;
        boolean pool = true;
        boolean houseForSale = false;
        double costOfHouse = 655999;
        String address = "75 Kawasaki Dr. Altoona. USA";
        int zipCode = 12345;
        boolean nearByPark = true;
        int localSchoolRatings = 5;
        char inSafeNeibrhd = 'Y';

// I used Boolean not proper way, just for practice===============================
        System.out.println("We have recently bought "+houseType);
        System.out.println("Number of bedrooms in our house: "+numOfBdrms);
        System.out.println("Our house has: "+numOfBath+" bathrooms");
        System.out.println("We have "+numOfKitchen+" kitchens and "+dining+" dining areas");
        System.out.println("it is "+basement+" that we have basement");
        System.out.println("There was "+attic+" info that house has attic");
        System.out.println("Believe me it is "+pool+" that we have pool");
        System.out.println("It is "+houseForSale+" that house is for sale anymore");
        System.out.println("Final price we paid for house is: $"+costOfHouse);
        System.out.println("Now our new address is: "+address+" "+zipCode);
        System.out.println("Mom, is it "+nearByPark+" that we have park nearby?");
        System.out.println("Our house located at "+localSchoolRatings+"* rated school district");
        System.out.println("Is the house located in safe neighborhood? "+inSafeNeibrhd+"es!");

    }
}
