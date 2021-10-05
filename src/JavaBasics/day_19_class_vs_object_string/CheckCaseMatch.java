package JavaBasics.day_19_class_vs_object_string;

public class CheckCaseMatch {
    public static void main(String[] args) {

        String countryCode = "UsA";
        if (countryCode.equals(countryCode.toUpperCase())){         // To check if values are Upper Case
            System.out.println(countryCode);
        }else{
            System.out.println("Type Country code in UPPER Case");
        }
        String word = "Java";
        String urword = word.toUpperCase();
        System.out.println(word + "-->" + urword);

        if (word.equals(urword)){
            System.out.println("match");
        }else{
            System.out.println("mismatch");
        }
    }
}
