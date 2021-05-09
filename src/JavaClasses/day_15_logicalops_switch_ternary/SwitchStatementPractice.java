package JavaClasses.day_15_logicalops_switch_ternary;

public class SwitchStatementPractice {
    public static void main(String[] args) {

        int
                monthNumber = 4;
        String monthName;
        switch (monthNumber){
            case 1:
                monthName = "January";
                System.out.println("1st month in a year a is "+monthName);
                break;
            case 2:
                monthName = "February";
                System.out.println("2nd month in a year a is "+monthName);
                break;
            case 3:
                monthName = "March";
                System.out.println("3rd month in a year a is "+monthName);
                break;
            case 4:
                monthName = "April";
                System.out.println("4th month in a year a is "+monthName);
                break;
            case 5:
                monthName = "May";
                System.out.println("5th month in a year a is "+monthName);
                break;


        }
    }
}
