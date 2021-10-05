package myOwnPractices.replPractise.CreditCard;

public class CreditCardTester {
    public static void main(String[] args) {

    Discover discover = new Discover(594849844,9585);
        System.out.println(discover);

    CapitalOne capitalOne = new CapitalOne(84887112,571);
    capitalOne.useCard();
        System.out.println(capitalOne);

    Chase chase = new Chase(5297481,7115);
        chase.payBalance(chase.balance);
        System.out.println(chase);
    }
}
