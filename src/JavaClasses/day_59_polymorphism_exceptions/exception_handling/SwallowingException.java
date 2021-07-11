package JavaClasses.day_59_polymorphism_exceptions.exception_handling;

public class SwallowingException {
    public static void main(String[] args) {

        try{
            System.out.println("hello");
            System.out.println(5/0);
        } catch (Exception ignore) {
    }

        System.out.println("How are you today?");
        System.out.println("we just surpassed / swallowed runtime Exception");
        System.out.println("Error is not reported. We ignored it. No one knows.");

    }

}
