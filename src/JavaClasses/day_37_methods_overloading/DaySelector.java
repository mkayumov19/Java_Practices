package JavaClasses.day_37_methods_overloading;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DaySelector {

    public static void main(String[] args) {
        System.out.println(getDayName(1));
        System.out.println(getDayName(5));
        System.out.println(getDayName(10));

        //loop from 1 to 8 and call the getDayName with loop variable
        for (int i = 1; i < 9; i++) {
            System.out.println(i + " = " + getDayName(i));
        }

        //Store getDayName into variable, and print variable
        String today = getDayName(6);
        System.out.println("today = " + today);
        String thisDay = getDayName(0);
            if (thisDay == null) {
                System.out.println("thisDay is Null for Invalid day");
        }

        System.out.println(getDayName2(7));

    }

    public static String getDayName(int day) {
        switch (day) {
            case 1:
                return "Monday"; //exit method
            //break; //unreachable code, because return already exits the method
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                System.out.println("ERROR: Invalid day - " + day);
                return null;//nothing, no object
        }
    }

    public static String getDayName2 (int day2){
        String dayName2;
        switch (day2) {
            case 1:  dayName2 = "Monday";  break;
            case 2:  dayName2 = "Tuesday";  break;
            case 3:  dayName2 = "Wednesday";  break;
            case 4:  dayName2 = "Thursday";  break;
            case 5:  dayName2 = "Friday";  break;
            case 6:  dayName2 = "Saturday";  break;
            case 7:  dayName2 = "Sunday";  break;
            default:
                System.out.println("Invalid day " + day2);
                dayName2 = null;
        }
        return dayName2;
    }

}












