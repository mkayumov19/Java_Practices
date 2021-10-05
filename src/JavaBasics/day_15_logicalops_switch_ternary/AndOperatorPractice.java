package JavaBasics.day_15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {

        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Iphone 12";

        if (onSale && freeShipping && itemName.equals("Iphone 12")){
            System.out.println("If "+ itemName+ "on sale and has free shipping, order ASAP");
        } else {
            System.out.println("Forget about Iphone-Piyphone");
        }
        String location = "My current location";
        double salary = 100_000.0;
        boolean isRemote = true;
        boolean isBenefits = true;

        if (location.equals("My current location") && salary >= 100_000.0 && isRemote && isBenefits){
            System.out.println("No doubt, Accept Offer");
        } else if (location.equals("Any City") && isRemote && isBenefits && salary >= 120_000.0){
            System.out.println("If relocations expenses covered, Accept offer");
        } else {
            System.out.println("Keep it on Hold");
        }

    }
}
