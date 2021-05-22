package OfficeHours.Practice_05_12;

public class Bank {
    public static void main(String[] args) {

        BankAccount bankAccountOne = new BankAccount();

        bankAccountOne.accountHolderName = "James Bond";
        bankAccountOne.pin = 1234;
        bankAccountOne.balance = 1000000;
        bankAccountOne.accountNumber = 2134567512;

        System.out.println(bankAccountOne.pin);

        bankAccountOne = new BankAccount();
        System.out.println(bankAccountOne.pin);
        BankAccount accountTwo = new BankAccount();
        System.out.println(accountTwo.balance);

    }
}
