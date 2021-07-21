package JavaClasses.day_10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int num1 = 10;
        num1 = num1 + 9;
            System.out.println("Num1 = "+num1);

// Same calculation with shorthand operator:

        int num2 =10;
        num2 += 9;
            System.out.println("Num2 = " + num2);
        int cars = 10;
        cars = cars + 2;
            System.out.println("Cars in lot: " + cars);
        cars += 5;
            System.out.println("Cars in lot now: " + cars);
        cars -= 6;
            System.out.println("Cars in lot now: " + cars);
        cars *= 3;
            System.out.println("Cars in lot now: " + cars);
        cars /= 3;
            System.out.println("Cars in lot now: " + cars);
        int electricCars = 13;
        cars += electricCars;
            System.out.println("Cars in lot with electric cars: " + cars);
        String word = "Java";
            System.out.println("Word = " + word);
        word = word + "Programming";
            System.out.println("Word = " + word);
        word += " is fun.";
            System.out.println(word);
        String selenium = " But selenium is more fun - ";
        word += selenium;
            System.out.println(word);
        word += 2021;
            System.out.println(word);
        char letter = 'A';                      // behind A = 65
            System.out.println("Letter: " + letter);
        letter += 3;                             //added 3 to 65(A) =68 (D)
            System.out.println("Letter: " + letter);
        letter += '1';
            System.out.println("Letter: " + letter);
        double parkingFee = 7.5;
            System.out.println("Normal parking fee: $" + parkingFee);
        parkingFee /= 2;
            System.out.println("Early-bird fee: $" + parkingFee);
        parkingFee -= parkingFee;
            System.out.println("Weekend parking fee: " + parkingFee);

    }
}
