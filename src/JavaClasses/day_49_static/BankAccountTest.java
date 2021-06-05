package JavaClasses.day_49_static;

import OfficeHours.Practice_05_12.Bank;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount husband = new BankAccount();
        husband.user = "husband";
        husband.showBalance();
        husband.spend(100);
        husband.showBalance();

        BankAccount wife = new BankAccount();
        wife.user = "wife";
        wife.showBalance();
        wife.spend(400);
        System.out.println(BankAccount.balance);

    }
}
