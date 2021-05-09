package MyOwnPractices.replitTasks;

public class ProfitOrLossMethods {
    public static void main(String[] args) {
        profits(100,500);
        System.out.println();
    }

    public static String profits(int buyPrice,int sellPrice){
        String result = "";
        if(buyPrice < sellPrice){
            result = "profit";
        } else if (buyPrice > sellPrice){
            result = "loss";
        }else{
            result = "no loss";
        }
            return result;
        }
}
