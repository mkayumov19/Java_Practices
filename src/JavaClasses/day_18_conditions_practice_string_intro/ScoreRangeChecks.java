package JavaClasses.day_18_conditions_practice_string_intro;

public class ScoreRangeChecks {
    public static void main(String[] args) {

        int num = 99;
        if (num >= 1 && num < 40){
            System.out.println("D");
        }else if (num >= 40 && num < 60){
            System.out.println("C");
        }else if (num >= 60 && num < 90){
            System.out.println("B");
        }else if (num >=90 && num < 100){
            System.out.println("A");
        } else {
            System.out.println("Invalid number");
        }
//====================================================================================
        num = 66;
        if (num >= 1 && num < 40){
            System.out.println("D");
        }else if (num >= 40 && num < 60){
            System.out.println("C");
        }else if (num >= 60 && num < 90){
            System.out.println("B");
        }else if (num >=90 && num < 100){
            System.out.println("A");
        } else if (num <= 0 || num > 100){
            System.out.println("Invalid Number");
        }
    }
}
