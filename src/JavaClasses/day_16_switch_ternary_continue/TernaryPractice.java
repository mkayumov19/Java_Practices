package JavaClasses.day_16_switch_ternary_continue;

public class TernaryPractice {
    public static void main(String[] args) {

        String result;
        int score = 90;
        if (score > 60){
            result = "True";
            System.out.println(result);
        }else{
            result = "False";
            System.out.println(result);
        }
//   ==================================================================================
       int condition = 80;
        String resultOne = (condition < 60) ? "True" : "False";
            System.out.println(resultOne);

    }
}
