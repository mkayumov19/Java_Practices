package JavaClasses.day_12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed, speedLimit;
            boolean isSpeeding;
            currentSpeed = 45;
            speedLimit = 55;
            isSpeeding = currentSpeed > speedLimit;
                System.out.println("Radar detected speeding: "+isSpeeding+". Current speed: "
                +currentSpeed+". Speed limit is: "+speedLimit);
            currentSpeed +=20;
            isSpeeding = currentSpeed > speedLimit;
            int overSpeed = currentSpeed - speedLimit;
                System.out.println("Radar detected speeding: "+isSpeeding+". Current speed: "
                +currentSpeed+". Speed limit is: "+speedLimit+". Over limit: "+overSpeed);
            double accountBalance = 250.25;
            double itemPrice = 100.99;
                System.out.println("Can I afford? - "+ (accountBalance >= itemPrice));
            boolean canAfford = accountBalance >= itemPrice;
                System.out.println("Can afford? - " + canAfford);
            accountBalance -= itemPrice;
                System.out.println(accountBalance);
            boolean isBroke = accountBalance <= 0;
                System.out.println("You are broke: - "+ isBroke);

    }
}
