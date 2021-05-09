package JavaClasses.day_17_ternary_nested_icondition;
import java.util.Scanner;
public class Marriage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you married? Answer: yes or no.");

        boolean isMarried = true;
        int children = 0;
        String parties;

        if (isMarried){
            parties = "No more Parties!";
            if (parties.equals("No more Parties!") && children == 3){
                System.out.println("we are sorry for you!");
            }else{
                System.out.println("Sometimes chilling out!");
            }
        }else{
            System.out.println("Marrieage is beautiful! Quickly marry!");

        }
    }
}
