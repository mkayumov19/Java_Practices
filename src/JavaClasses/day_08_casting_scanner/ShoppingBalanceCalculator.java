package JavaClasses.day_08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args){

        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15;
        double afterDamage = balance-price1-price2-price3;
        double remainingBalance = balance - (price1+price2+price3);

        System.out.println("After damage we have: $"+afterDamage);
        System.out.println("Remaining balance is: $"+remainingBalance);

        double newBalance = remainingBalance;
        System.out.println("New balance is: $"+newBalance);

        int freshBalance = (int)newBalance;
        System.out.println("Balance without change: $"+freshBalance);

        double spentRemainder = balance % remainingBalance;
        System.out.println("Your wife spent from your VISA today: $"+spentRemainder);
    }
}
