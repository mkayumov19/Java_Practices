package JavaBasics.day_19_class_vs_object_string;

public class StringComparison {
    public static void main(String[] args){

        String city = "Tampa";
//      .EQUALS() method ------> CASE SENSITIVE COMPARISON
            System.out.println(city.equals("Tampa"));     //true
            System.out.println(city.equals("tampa"));     //false
            System.out.println(city.equals("tampa "));    //false
            System.out.println(city.equals("tampa"));

//      .EQUALSIGNORECASE() METHOD -------> CASE INSENSITIVE
            System.out.println(city.equalsIgnoreCase("Tampa"));   //true
            System.out.println(city.equalsIgnoreCase("TampA"));   //true
            System.out.println(city.equalsIgnoreCase("TAMPA"));   //true
            System.out.println(city.equalsIgnoreCase("tampa"));   //true
            System.out.println(city.equalsIgnoreCase("Tam pa"));  //false
            System.out.println(city.equalsIgnoreCase("Taampa"));  //false

        if (city.equals("TAMPA")){
            System.out.print(("Incorrect answer/case sensitive"));
            System.out.println(city.equals("Tampa"));
        }else{
            System.out.println("Correct answer was: " + city);
            System.out.println("You entered: TAMPA");
        }
        if (city.equalsIgnoreCase("TaMpA")){
            System.out.println("equalsignorecase() true");
        }else {
            System.out.println("equalsignorecase() false");
        }
    }
}
