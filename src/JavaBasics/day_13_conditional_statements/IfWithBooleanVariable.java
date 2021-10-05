package JavaBasics.day_13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {

        boolean isHungry = true;
        if (isHungry) {
            System.out.println("I am hungry I will get to eat something.");
            System.out.println("Then code Java.");
        } else {
            System.out.println("I am not hungry. Lets keep coding Java.");
        }

        double price = 130.44;
        boolean isAffordable = price <= 200.0 ;
        if (isAffordable) {
            System.out.println("I can afford it. Lets buy. "+ isAffordable);
        } else {
            System.out.println("Too expensive. Lets keep coding Java");
        }

        boolean isRemoteJob = true;
        if (!isRemoteJob) {                             //----->> equal to: (isRemoteJob != true)

            System.out.println("Sorry I am not interested");
        } else{
            System.out.println("Sure I am interested. Whats interview process?");
        }
    }
}
