package JavaClasses.day_20_string_manipulation;

public class ContainsStringMethod {
    public static void main(String[] args) {

/**        Checks if string within the variable value and returns true or false */

        String word = "java";
        System.out.println(word.contains("v"));         // true
        System.out.println(word.contains("va"));        // true
        System.out.println(word.contains("ja"));        // true
        System.out.println(word.contains("a"));         // true
        System.out.println(word.contains("jv"));        // false
        System.out.println(word.contains("Ja"));        // false

        String company = "Capital one";
        System.out.println(company.contains("i"));      // true
        System.out.println(company.contains("ital"));   // true
        System.out.println(company.contains("l o"));    // true

        if (company.contains(" ")){
            System.out.println("Company name with multiple words");
        }else{
            System.out.println("Company name consist one word");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        System.out.println(etsyTitle.contains("|"));

        String firstName = "Ahmed";
        if (firstName.contains("a") && firstName.contains("e")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        String name = "Nadir";
        if (name.contains("a") || name.contains("r")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        String email = "MURODIL@cybertekschool.com";
        if (email.contains("@") && email.endsWith(".com")){
            System.out.println("Correct email");
        }else{
            System.out.println("Wrong email");
        }
        if (email.toLowerCase().contains("d")){               //to make value case insensitive. (to lowercase->Contains)
            System.out.println();
        }
    }
}








