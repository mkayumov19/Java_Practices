package JavaClasses.day_23_string_manipulation_while_loop;

public class ChainingStringMethods {
    public static void main(String[] args) {

        String word = "wooden spoon";
        System.out.println(word.toUpperCase().toLowerCase().length());
        System.out.println(word.replace(" ","").toUpperCase());

        String city = "CHICAGO";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());
        System.out.println();

    }
}
