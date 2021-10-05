package myOwnPractices.replPractise.CreditCard;

public class CapitalOne extends CreditCard{

    public CapitalOne(long cardNumber, double balance) {

        double apr = 14.35;
        boolean cashBack = false;
        super.cardNumber = cardNumber;
        super.balance = balance;
        super.apr = apr;
        super.cashback = cashBack;
    }

    @Override
    public  void useCard(){
        System.out.println("Using Capital One card");
    }

    @Override
    public void payBalance(double balance) {
        System.out.println("Paying "+balance+" from "+this.balance);
    }

    @Override
    public String toString() {
        return "Capital One credit card | card number: "+cardNumber+" | balance used: "+balance+" | APR: "+apr+" | has cashback: "+cashback;
    }

}
