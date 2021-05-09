package JavaClasses.day_13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {

        double salesAmount = 2000.55;
        double bonus = 0;
        if (salesAmount <= 1000) {
            bonus = 50;
            System.out.println("Good job, you qualify for bonus of " + bonus);
        } else {
            bonus = 100;
            System.out.println("Very good job, you qualified for full bonus of: " + bonus);
        }
    }
}
