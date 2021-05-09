package JavaClasses.day_14_multi_branch_if_statements;

public class ChooseLanguages {
    public static void main(String[] args) {

        System.out.println("Choose your language:");
        int selection = 7;
        if (selection == 1) {
            System.out.println("Hello, thank you for your call.");
        } else if (selection == 2) {
            System.out.println("Hola, gracias para llamar");
        } else if (selection == 3) {
            System.out.println("Merhaba, aradingiz icin tesekkurler");
        } else if (selection == 4) {
            System.out.println("Privet, spasibo za vash zvonok");
        } else if (selection == 5) {
            System.out.println("Merci, pour votre appel");
        } else {
            System.out.println("Sorry your language is seems to be not international");
        }
    }
}
