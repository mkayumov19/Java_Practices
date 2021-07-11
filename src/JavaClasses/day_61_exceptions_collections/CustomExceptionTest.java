package JavaClasses.day_61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 40;
        System.out.println("Class is going on for " + minutes + " minutes.");

        if (minutes > 50) {
//            throw new BreakTimeException();
            throw new BreakTimeException("It's break time!");
        }
        System.out.println("Let's continue the class");

        double balance = 600.0;
        double itemPrice = 500;
        System.out.println("I want to buy new program for $" + itemPrice + ". Can I afford it?");

        if (itemPrice > balance){
            throw new InsufficientBalanceException("Transaction will be declined because of Insufficient funds!");
        } else {
            System.out.println("Your balance is: $" + balance);
        }

    }
}
