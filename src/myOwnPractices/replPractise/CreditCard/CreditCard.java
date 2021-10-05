package myOwnPractices.replPractise.CreditCard;

public abstract class CreditCard {

    long cardNumber;
    double balance;
    double apr;
    boolean cashback;

    protected CreditCard() {
    }

    public CreditCard(long cardNumber, double balance, double apr, boolean cashback){
        this. cardNumber = cardNumber;
        this.balance = balance;
        this.apr = apr;
        this.cashback = cashback;

    }

    @Override
    public String toString() {
        return "Credit card | card number: "+cardNumber+" | balance used: "+balance+" | APR: "+apr+" | has cashback: "+cashback;
    }

    public abstract void useCard();
    public abstract void payBalance(double balance);


}
