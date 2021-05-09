package JavaClasses.day_17_ternary_nested_icondition;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 70;
        String quality = "good";

        String result = (score > 60) ? "Pass" : "Fail";
        System.out.println("Pass if score larger than 60: "+result);

        int x = (quality.equals("good")) ? 100 : 0;
        System.out.println("Quality is: "+x);
        System.out.println("Second quality: "+((quality.equals("Good")) ? 100 : 0));     // using without assigning to variable

        char grade = (score > 90) ? 'A' : 'B';
        System.out.println("Result: "+grade);

        String evenOdd = (score % 2 == 0) ? "even" : "odd";
        System.out.println("Result: "+evenOdd);
//     ==========================================================================


    }
}
