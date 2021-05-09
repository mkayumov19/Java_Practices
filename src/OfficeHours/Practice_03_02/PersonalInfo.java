package OfficeHours.Practice_03_02;

public class PersonalInfo {

    public static void main(String [] args) {

        // Variables without any data
        String name, fullBirthDate, favoriteQuote;
        byte age;
        char gender;
        boolean isStudent;
        short numberOfSiblings;
        long favoriteNumber;
        int numberOfSeasons, year;
        double birthDate;

        // Assignment of data
        name = "Makhmudjon";
        age = 37;
        gender = 'M';
        isStudent = true;
        numberOfSiblings = 5;
        favoriteNumber = 9L;
        numberOfSeasons= 4;
        birthDate = 01.19;
        year = 1984;

        fullBirthDate = "" + birthDate + "." + year; // 1.19.1984
//      fullBirthDate = birthDate + year + "" ; // 1985.19 -> adds first then turns to String
        favoriteQuote = "Have a positive and right mindset";


        // Printing information based on variables
        System.out.println("----Personal Information----");
        System.out.println("Name: " + name);
        System.out.println("Age: "+ age);
        System.out.println("Gender: " + gender);
        System.out.println("Are you a student: " + isStudent);
        System.out.println("Number of siblings: " + numberOfSiblings);
        System.out.println("Favorite number: " + favoriteNumber);
        System.out.println("Seasons in your area: " + numberOfSeasons);
        System.out.println("Full birthdate: " + fullBirthDate);
        System.out.println("My favorite quote: " + favoriteQuote);


    }
}
