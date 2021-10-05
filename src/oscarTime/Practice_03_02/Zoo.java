package oscarTime.Practice_03_02;

public class Zoo {

        public static void main(String[] args) {

            String name = "Zoo", foundedDate = "March 3, 1950", startTime = "7:00 AM",
                   closingTime = "5:00 PM", parkRules = "No Alcohol, No feeding Animals, No jumping in Cages!";
            boolean isOpenOnHolidays = true, hasAquarium = false;
            int numOfBigCats = 25, numOfHoofedAnimals = 46, numOfReptiles = 82, numOfBirds = 285,
                    numOfPrimates = 46, numOfEmployees = 50;
            double ticketForAdults = 38.50, ticketForUnder13 = 28.99;

            System.out.println("--------------- Welcome To Tampa ZOO ---------------");
            System.out.println("Tampa "+name+" Brochure for 2021");
            System.out.println(name+ " founded: "+foundedDate+"\nGates open : "+startTime+"\nGates close: "+closingTime+
                  "\n"+name+" is open on Holidays: "+isOpenOnHolidays);
            System.out.println(name+" habitants info: \n Number of big cats: "+numOfBigCats+"\n Number of hoofed animals: "+
                    +numOfHoofedAnimals+"\n Number of Reptiles: "+numOfReptiles+"\n Number of birds: "+numOfBirds+
                  "\n Number of Primates: "+numOfPrimates+"\n Plus many other kinds of animals.");
            System.out.println("Is there Aquarium available: - "+hasAquarium);
            System.out.println("Currently we have "+numOfEmployees+" employees and we are hiring now.");
            System.out.println("\t\t\t\tTicket information: \n\t\t\t\tAdult: $"+ticketForAdults+
                  "\n\t\t\t\tChildren under 13: $"+ticketForUnder13);
            System.out.println("Please respect our rules: "+parkRules);


        }
}
