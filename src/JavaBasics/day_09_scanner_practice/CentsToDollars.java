package JavaBasics.day_09_scanner_practice;

public class CentsToDollars {
    public static void main(String[] args) {

        int cents = 123;
        int dollars = cents/100;
        int remainingCents = cents%100;
        System.out.println("cents = "+cents);
        System.out.println("dollars = "+dollars);
        System.out.println("remaining cents = "+remainingCents);

        System.out.println(cents+" cents are "+dollars+" dollars and "+remainingCents+" cents");

    }
}
