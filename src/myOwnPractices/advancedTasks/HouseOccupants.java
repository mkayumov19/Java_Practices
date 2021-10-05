package myOwnPractices.advancedTasks;
import java.util.Scanner;
public class HouseOccupants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type one of below to get max occupants count:\n1)Tree house," +
                        " 2)Mobile home, 3)Apartment, 4)Town house, 5)Villa or 6)Mansion)");
        String house = scan.nextLine();
        int occupants = 0;
        switch (house){
             case "Tree house":
                 occupants = 1;
             break;
             case "Mobile home":
                 occupants = 2;
                 break;
             case "Apartment":
                 occupants = 4;
                 break;
             case "Town house":
                 occupants = 6;
                 break;
             case "Villa":
                 occupants = 8;
                 break;
             case "Mansion":
                 occupants = 10;
                 break;
             default:
                 System.out.println("Not correct house type.");
         }
        System.out.println("Maximum number of occupants at "+house+": "+occupants);
    }
}
