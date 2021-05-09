package JavaClasses.day_10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
            System.out.println("\t\tTotal Balance: $" + balance);
        double baklava = 22.50;
            System.out.println("Baklava = $" + baklava);
        balance = balance -baklava;
            System.out.println("\t\tAfter baklava = $" + balance);
        double kenafe = 44.45;
            System.out.println("Kenafe = $" + kenafe);
        balance = balance - kenafe;
            System.out.println("\t\tBalance after baklava and kenafe: $" + balance );
        kenafe = kenafe / 2;
        balance = balance - kenafe;
            System.out.println("\t\tBalance after second %50 off kenafe: $" + balance);
        double plov = 7.99;
            System.out.println("Plov = $" + plov);
        balance = balance - plov;
            System.out.println("\t\tAfter plov we have: $"+balance);
        double icedTea = 3.0;
            System.out.println("Iced tea = $"+icedTea);
        balance = balance - icedTea * 4;                            // (icedTea * 4) -->() optional
            System.out.println("\t\tBalance after all: $"+balance);
        balance = balance + baklava;
            System.out.println("\t\tBaklava returned.\n\t\tBalance after returning baklava: $"+balance);
        balance = balance + kenafe;
            System.out.println("We returned 1 kenafe and balance: $"+balance);

    }
}
