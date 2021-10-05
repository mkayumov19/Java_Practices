package JavaBasics.day_15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {

        String city = "Moscow";
        String cityTwo ="Tampa";
        if (city.equals("Tampa") || cityTwo.equals("Moscow")){
            System.out.println("Move to First city");
        } else if (city.equals("moscow") ||cityTwo.equals("Tampa")){
            System.out.println("Move to Second city");
        } else if (city.equals("Fairfax") || cityTwo.equals("Tampa")){
            System.out.println("Move to Third city");
        } else if (city.equals("Paris") || cityTwo.equals("London")){
            System.out.println("Do not move");
        }
        String city2 = "Tashkent";
        if (city2.equals("Tashkent") || city2.equals("Moscow")){
            System.out.println("I am willing to travel to: "+city2);
        } else {
            System.out.println("No plans to travel");
        }
        String teacher = "Nadir";
        if (teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It is Java class with " + teacher);
        } else {
            System.out.println("It is Soft skills class with "+teacher);
        }
        String domlo = "Murodil";
        if (domlo.equals("Murodil") || domlo.equals("Saim")){
            System.out.println("Java teacher is "+domlo);
        } else if (domlo.equals("Saim") || domlo.equals("Akbar")){
            System.out.println("Java teacher is still "+teacher);
        } else {
            System.out.println("Are you really student?");
        }
        String company = "GOOGLE";
        double salary = 100_000.0;
        if (company.equals("google") || salary > 100_000.0){
            System.out.println("Accept the offer");
        }

    }
}
