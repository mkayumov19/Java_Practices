package JavaClasses.day_36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {

        checkEligible(750);

    }

    public static void checkEligible(int creditScore){
        if(creditScore >= 750 && creditScore <= 800 ){
            System.out.println("Your Credit score is Very Good");
        } else if(creditScore >= 670 && creditScore < 750){
            System.out.println("Your credit score is Good");
        }
    }

}
