package myOwnPractices.replPractise.CreditCard;

public class Discover extends CreditCard{

    public Discover(long cardNumber, double balance){
        double apr = 11.99;
        boolean cashBack = true;
        super.cardNumber = cardNumber;
        super.balance = balance;
        super.apr = apr;
        this.cashback = cashBack;
    }

    @Override
    public void useCard(){
        System.out.println("Using Discover card");
    }

    @Override
    public void payBalance(double balance){
        System.out.println("Paying "+balance+" from "+this.balance);
    }

    @Override
    public String toString() {
        return "Discover credit card | card number: "+cardNumber+" | balance used: "+balance+" | APR: "+apr+" | has cashback: "+cashback;
    }
}
