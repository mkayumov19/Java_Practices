package JavaBasics.day_17_ternary_nested_icondition;

public class TeslaNestedIf {
    public static void main(String[] args) {

        char model = 'S';
        String trim = "Long range";

        if(model == 'S'){
            System.out.println("Model: \""+model+"\" selected");
            if (trim.equals("Long range")){
                System.out.println("\""+trim+"\" - trim selected");
            }
        }

    }
}

//char model = 'S';
//trim -> "Long range"
//when model 'S'
//    if trim is "long range":
//        "range: 412"
//        "top speed: 155 mph"
//        "0-60- 3.1sec"
//    if trim is "Plaid":
//        "range: 412"
//        "top speed: 155 mph"
//        "0-60- 3.1sec"
//    if trim is "Plaid+":
//        "range: 412"
//        "top speed: 155 mph"
//        "0-60- 3.1sec"
//when model is '3'