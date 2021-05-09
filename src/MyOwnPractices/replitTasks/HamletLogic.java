package MyOwnPractices.replitTasks;

public class HamletLogic {
    public static void main(String[] args) {
        System.out.println(hamletQuote(false, false));
    }

    public static boolean hamletQuote(boolean toBe, boolean notToBe) {
        if (toBe || notToBe) {
            return true;
        }
        return false;
    }
}