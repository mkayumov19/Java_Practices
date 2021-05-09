package JavaClasses.day_10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        double rent = 1250.0;
        rent = rent + 50.0;
        double fuelPrice = 2.75;
        fuelPrice = fuelPrice - 1.0;
        System.out.println("Rent: $"+rent+"\nFuel price: $"+fuelPrice);
        int count = 3;
        System.out.println("Count: "+count);
        count = count + 2;                              //----------------->>>>> add/increase count by 2
        System.out.println("updated count: "+ count);   //------>> new value 5
        int apples = 5;
        System.out.println("apples = " + apples);
        apples = apples + 10;
        System.out.println("updated apples = " + apples);
        apples = apples - 3;
        System.out.println("last count apples = "+ apples);
        int pizzaSlices = 8;
        pizzaSlices = pizzaSlices / 2;
        System.out.println("Left slices: "+pizzaSlices + ". After getting angry: "+(pizzaSlices + 6));
        int cents = 244;
        System.out.println("Cents = " + cents);
        cents = cents % 100;                     //keep whole dollar portion, just assign remaining cents
        System.out.println("Remaining cents = " + cents);

    }

}
