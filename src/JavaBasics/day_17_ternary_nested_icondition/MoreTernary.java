package JavaBasics.day_17_ternary_nested_icondition;

public class MoreTernary {
    public static void main(String[] args) {
        int currentRate = 50;
        int offeredRate = 52;
        String reply = (offeredRate >= currentRate ) ? "Accept" : "Reject";
        System.out.println("Result: " + reply);
//==========================================================================================================

        String todaysClass = "Java";
        String teacher = (todaysClass.equals("Java")) ? "Murodil" : "Nadir";
        System.out.println("Todays teacher: "+teacher);
//==========================================================================================================

        boolean isEligibleToDrive = true;
        String driving = (isEligibleToDrive) ? "He has CDL, can drive truck" : "No CDL, no truck driving allowed";
        System.out.println("Can he drive truck? "+driving);

    }
}
