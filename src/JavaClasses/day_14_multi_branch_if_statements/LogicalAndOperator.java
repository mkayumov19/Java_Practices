package JavaClasses.day_14_multi_branch_if_statements;

public class LogicalAndOperator {
    public static void main(String[] args) {

        System.out.println(true && true);           // TRUE
        System.out.println(true && false);          // FALSE
        System.out.println(false && true);          // FALSE
        System.out.println(false && false);         // FALSE

        System.out.println(10 > 5 && 1 == 1);       //TRUE+TRUE=TRUE
        System.out.println(10 > 5 && 1 != 1);       //TRUE+FALSE=FALSE
        System.out.println(3 < 2 && 5 > 3);         //FALSE+TRUE=FALSE
        System.out.println(100/10 ==10 && 10*10==100);      //TRUE

        int apples = 10, oranges = 5;
        boolean check =apples > 6 && oranges > 3;
        if (check){
            System.out.println("Beleive me it's "+check);
        }
    }
}
