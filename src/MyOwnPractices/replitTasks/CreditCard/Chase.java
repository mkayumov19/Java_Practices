package MyOwnPractices.replitTasks.CreditCard;

public  class Chase extends CreditCard{

   public Chase(long cardNumber, double balance){

       double apr = 10.99;
       boolean cashBack = false;
       super.cardNumber = cardNumber;
       super.balance = balance;
       super.apr = apr;
       super.cashback = cashBack;

   }

    @Override
    public void useCard() {
        System.out.println("Using Chase card");
    }

    @Override
    public void payBalance(double balance) {
        System.out.println("Paying "+balance+" from "+this.balance);
    }

    @Override
    public String toString() {
        return "Chase credit card | card number: "+cardNumber+" | balance used: "+balance+" | APR: "+apr+" | has cashback: "+cashback;
    }

}
