package myOwnPractices.mixedPractices;

import java.util.Scanner;

public class RealEstateCalculator {
    public static void main(String[] args) {
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        System.out.println("Enter property type:");
        houseType = scan.nextLine();
        if (houseType.equals("Condo") || houseType.equals("condo")) {
            propertyPrice = 50_000;
        } else if (houseType.equals("Townhouse") || houseType.equals("townhouse")) {
            propertyPrice = 75_000;
        } else if (houseType.equals("Single Family Home") || houseType.equals("single family home") ||
                houseType.equals("Single family home")) {
            propertyPrice = 95_000;
        }
        System.out.println("How many bedrooms do you have?");
        numberOfBedrooms = scan.nextInt();
        propertyPrice = numberOfBedrooms * 30_000 + propertyPrice;
        System.out.println("Do you have a backyard?");
        backyard = scan.nextBoolean();
        if (backyard) {
            if (houseType.equals("Condo") || houseType.equals("condo")) {
                System.out.println("Backyard is not available for condo!");
            } else {
                propertyPrice = propertyPrice + 5000;
            }
        }
        System.out.println("Do you have garage?");
        garage = scan.nextBoolean();
        if (garage) {
            System.out.println("How many spots?");
            garageSpots = scan.nextInt();
            if (garageSpots > 10) {
                System.out.println("Pardon, it's not a public parking!");
            } else {
                propertyPrice = propertyPrice + garageSpots * 20000;
            }
        }
        System.out.println("How close is metro station?");
        metroAccessibility = scan.nextFloat();
        if (metroAccessibility <= 1) {
            propertyPrice = propertyPrice + 10000;
        } else if (metroAccessibility > 1 && metroAccessibility < 3)
            propertyPrice = propertyPrice + 5000;

        System.out.println("How close is highway?");
        highwayAccessibility = scan.nextFloat();
        if (highwayAccessibility <= 1) {
            propertyPrice = propertyPrice + 15000;
        } else if (highwayAccessibility > 1 && highwayAccessibility <= 5) {
            propertyPrice = propertyPrice + 8000;
        } else if (highwayAccessibility > 5 && highwayAccessibility <= 20) {
            propertyPrice = propertyPrice + 4000;
        }
        System.out.println("What's the rating of nearest school?");
        schoolScore = scan.nextInt();
        if (schoolScore > 8 && schoolScore <= 10) {
            propertyPrice = propertyPrice + 45000;
        } else if (schoolScore < 8 && schoolScore >= 4) {
            propertyPrice = propertyPrice + 20000;
        } else {
            propertyPrice = propertyPrice + 5000;
        }
        System.out.println("Does any of your family members smoke?");
        smoking = scan.nextBoolean();
        if (smoking) {
            propertyPrice = propertyPrice - 5000;
        }
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: " + propertyPrice + "$");
    }
}