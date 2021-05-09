package JavaClasses.day_10_shorthand_operators;

public class IncrementDecrementOperators {
    public static void main(String[] args) {

//    ++, --    -----------> only increases/decreases by 1.
        int i = 2;
        i++;
            System.out.println("first i: "+i);
        ++i;
            System.out.println("second i: "+i);

        int num1 = 5;
        num1 = num1 + 1;
        num1 += 1;
        num1++;
        ++num1;
            System.out.println("Num1: "+num1);
        int linesOfCode = 15;
            System.out.println("Lines of code: "+linesOfCode);
        linesOfCode = linesOfCode + 1;                          //adding 1
        linesOfCode +=1;                                        //adding 1
        linesOfCode++;                                          //adding 1
        ++linesOfCode;                                          //adding 1  (++linesOfCode++)-->ERROR
            System.out.println("4 ways increased total: "+linesOfCode);
        linesOfCode = linesOfCode - 1;
        linesOfCode -=1;
        linesOfCode--;
        --linesOfCode;
        System.out.println("4 ways decreased total: "+linesOfCode);

        char letter = 'a';
        System.out.println("Letter = "+letter);
        letter++;
        System.out.println("letter = "+letter);
        ++letter;
        System.out.println("letter = "+letter);
        letter--; letter--; letter--;           //---------------> works this way. but not common
        System.out.println("letter = "+letter);

    }
}
