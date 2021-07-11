package JavaClasses.day_60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        String word = "java";
//        String word1 = null;
    try {
        System.out.println("Length = " + word.length());
//        System.out.println("Length = " + word1.length());
        System.out.println(word.substring(20));
//        System.out.println(word.substring(10));
    } catch (NullPointerException e) {
        System.out.println("NullPointerException caught and handled");
        System.out.println("Reason: " + e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Index is wrong.");
        System.out.println("Reason: " + e.getMessage());
    } catch (Throwable t) {
        System.out.println("Exception is caught");
        System.out.println("Reason: " + t.getMessage());
    }

    }
}
