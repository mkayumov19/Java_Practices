package JavaClasses.day_15_logicalops_switch_ternary;

public class OrLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true || true));
        System.out.println("true || false = " + (true || false) );
        System.out.println("false || true = " + (false || true));
        System.out.println("false || false = "+ (false || false));

        int apples = 5;
        int oranges = 7;
        if (apples > 4 || oranges > 5){
            System.out.println("Do not buy fruit today");
        } else if (apples < 4 || oranges > 5){
            System.out.println("We dont need need to buy fruits");
        } else if (apples < 5 || oranges < 10){
            System.out.println("I told you no fruit today");
        } else if (apples < 5 || oranges < 10){
            System.out.println("Buy some fruit");
        }

    }
}
