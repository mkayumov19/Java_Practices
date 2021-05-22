package JavaClasses.day_46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {

        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(1234567890);
        acc.setBalance(28000);
        acc.setAccountHolder("Pingvin");
//        acc.setType("credit");

        System.out.println("Account holder = " + acc.getAccountHolder());
        System.out.println("Account number = " + acc.getAccountNumber());
        System.out.println("Account type = " + acc.getType());
        System.out.println("Account balance = " + acc.getBalance());

    }
}
