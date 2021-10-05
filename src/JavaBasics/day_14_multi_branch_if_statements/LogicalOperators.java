package JavaBasics.day_14_multi_branch_if_statements;

public class LogicalOperators {
    public static void main(String[] args) {
//        && ---> AND operator
//        || ---> OR operator
//        !  ---> NOT operator
        int apples = 5;
        int oranges = 9;

//          TRUE    &&    TRUE      ----> result is TRUE:
        if(apples > 3 && oranges > 5){
            System.out.println("Do not buy any more");

//               FALSE    &&    TRUE    -----> result is FALSE
       }else if(apples <3 && oranges >5){
            System.out.println();

        }
    }
}
