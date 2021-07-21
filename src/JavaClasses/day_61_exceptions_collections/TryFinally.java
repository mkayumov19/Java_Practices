package JavaClasses.day_61_exceptions_collections;

public class TryFinally {
    static String str;

    public static void main(String[] args) {

        // System.out.println(str.isEmpty());
        printThis(str);

        // Thread.sleep(1000);
        String[] array = { "1", "2", "3", "4" };
        // printsNumberFive(array);
        try {
            sleeps();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            str.isEmpty();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } // break 9.05
    }

    // throws indicates there is an exception but the problem will still exist
    // when you call the method.
    // It needs to be handled by the caller
    private static void sleeps() throws InterruptedException {
        Thread.sleep(1000);

    }

    public static void printThis(String printThis) {
        try {
            System.out.println(printThis.isEmpty());
            System.out.println(printThis.split(" ")[1]);
        } catch (NullPointerException e) {
            System.out.println("it was null");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array out of bounds");
        } finally {
            System.out.println("runs anyways");
        }
    }

    public static void printsNumberFive(String[] array) {
        anotherLevel(array);
    }

    private static void anotherLevel(String[] array) throws ArrayIndexOutOfBoundsException {
        System.out.println(array[4]);
    }

}
