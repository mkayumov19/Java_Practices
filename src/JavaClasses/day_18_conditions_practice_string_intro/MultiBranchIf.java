package JavaClasses.day_18_conditions_practice_string_intro;
import java.util.Scanner;
public class MultiBranchIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number:");
        int unputNum = scan.nextInt();

        if (unputNum > 0){
            System.out.println(unputNum + " is positive number");
        }else if (unputNum< 0){
            System.out.println(unputNum + " is negative number");
        }else{
            System.out.println(unputNum + " number is Zero");
        }
    }
}
