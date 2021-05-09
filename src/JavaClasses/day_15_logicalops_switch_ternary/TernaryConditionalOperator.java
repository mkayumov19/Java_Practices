package JavaClasses.day_15_logicalops_switch_ternary;

public class TernaryConditionalOperator {
    public static void main(String[] args) {

//      REGULAR IF ELSE STATEMENT: ===================================
//        int n1 = 5, n2 = 10;
//        int max;
//        if (n1 > n2) {
//            max = n1;
//        }else{
//            max = n2;
//        }
//        System.out.println(max);

//     TERNARY OPERATOR STATEMENT: ==================================
        int n1 = 5, n2 = 10;
        int max;
        max = (n1 > n2) ? n1 : n2;                      // returns n2 = 10
        System.out.println(max);
//==================================================================
        String action;
        boolean isGreen = true;
        action = (isGreen) ? "Can drive" : "Can not drive";     //returns Can drive
        System.out.println(action);
//===================================================================
        int bill = 2500;
        int discount = (bill > 2000) ? 15 : 10;                 //returns 15
        System.out.println(discount);
//===================================================================
//       NESTED IF CONDITIONAL STATEMENT: ======================
        int totalBill =1400;
        int quantity = 11;
        int discount2;
        if (totalBill > 1400){
             if(quantity > 11){
                 discount2 = 10;
             }else{
                 discount2 = 9;
             }
         }else{
             discount2 =5;
         }
        System.out.println(discount2+"%");
//====================================================================
//        NESTED TERNARY CONDITIONAL STATEMENT:
         totalBill = 1400;
         quantity = 11;
         discount2 = (totalBill > 1000) ? (quantity > 11) ? 10 : 9 : 5;
        System.out.println("%"+discount2);

    }
}
