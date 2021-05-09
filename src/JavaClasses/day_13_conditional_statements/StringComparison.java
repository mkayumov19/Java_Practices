package JavaClasses.day_13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {

        String city = "Los Angeles";
        if (city.equals("Los Angeles")) {         //if (city == "Los Angeles") ---> may work, but Avoid using that way.
            System.out.println("Ciy is "+city);
        } else {
            System.out.println("City is not Los Angeles");
        }

        String weather = "sunny";
        if (weather.equals("Sunny")) {
            System.out.println("Its "+city+" its always "+weather+" in here!");
        } else {
            System.out.println("Its unusual to have not sunny day in "+city);

        }
    }
}
