package JavaClasses.day_53_inheritance_3.hiding;

public class LandLinePhone {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    String type = "RotaryPhone]  ";

    public static void user() {
        System.out.println(ANSI_RED + "USE METHOD LANDLINE: Using LandLine phone" + ANSI_RESET);
    }

    public void call() {
        user();
        System.out.println(ANSI_CYAN + "And making a Wired phone call" + ANSI_RESET);
    }

}
