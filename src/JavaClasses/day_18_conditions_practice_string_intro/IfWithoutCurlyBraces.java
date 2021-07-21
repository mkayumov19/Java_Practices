package JavaClasses.day_18_conditions_practice_string_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {

        String todaysClass = "Java";
        if (todaysClass.equals("Java")) {                  // {} - curly brace. using with curly braces as usual.
            System.out.println("1st Java is fun");
        } else {
            System.out.println("Its not java. Its " + todaysClass);
        }
//============================================================================================================
        if (todaysClass.equals("Java"))                             // without curly brace {} can be used
            System.out.println("2nd Java is fun");                  // only when ONE statement in condition
         else                                                       // but not suggested
            System.out.println("Its not java. Its " + todaysClass);
// ===========================================================================================================
        int num = 0;
        if (num == 1)                                               // multibranch can be without {} as well if only 1
            System.out.println("print");                            // statement in condition
        else if (num > 1)
            System.out.println("Larger than 1");
        else if (num < 1)
            System.out.println("Smaller than 1");
        else if ( num != 0 && num >2)
            System.out.println("It works");

//  ===========================================================================================================
        int a = 2;
        if (a == 1)
            System.out.println("a is 1");               // this statement runs only if condition is True.
            System.out.println("1 is a");               // this statement runs always as its outside of condition block
//===============================================================================================================

    }
}
