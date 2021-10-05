package myOwnPractices.advancedTasks;

public class MorningOrNight {
    public static void main(String[] args) {

        int time = 26;
        String timeOfDay = (time >= 0 && time <12) ? "morning" : (time >= 12 && time <= 24 ) ? "evening" : "Incorrect number";
        System.out.println(timeOfDay);

    }
}
