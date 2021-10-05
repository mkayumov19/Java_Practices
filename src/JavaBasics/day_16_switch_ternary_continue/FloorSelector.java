package JavaBasics.day_16_switch_ternary_continue;

public class FloorSelector {
    public static void main(String[] args) {

        int floorNum = 1;
        if (floorNum == 1){
            System.out.println("Floor: "+floorNum+" selected. Companies: Lobby, Verizon, Starbucks");
        } else if (floorNum == 2){
            System.out.println("Floor: "+floorNum+" selected. Companies: Cybertek, NASA, IntelSat");
        } else if (floorNum == 3){
            System.out.println("Floor: "+floorNum+" selected. Companies: Lyft, BofA, Stake House");
        } else {
            System.out.println("Invalid floor number entered "+ floorNum);
        }
//  ===================================================================================================
         int switchNum = 2;
        switch (switchNum){
            case 1:
                System.out.println("Floor: "+switchNum+" selected. Companies: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor: "+switchNum+" selected. Companies: Cybertek, NASA, IntelSat");
                break;
            case 3:
                System.out.println("Floor: "+switchNum+" selected. Companies: Lyft, BofA, Stake House");
                break;
            default:
                System.out.println("Invalid floor number: "+switchNum+" entered ");
        }
//  ==================================================================================================
        String studentName = "Anton";
        switch (studentName){
            case "Anton":
                System.out.println("Welcome to Cybertek "+studentName);
                break;
            case "Shpak":
                System.out.println("Welcome to Cybertek "+studentName);
                break;
            case "Galochka":
                System.out.println("Welcome to Cybertek "+studentName);
                break;
            default:
                System.out.println("No students contacted us today.");
                break;
        }
    }
}
