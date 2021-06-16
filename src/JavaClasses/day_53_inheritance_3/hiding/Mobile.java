package JavaClasses.day_53_inheritance_3.hiding;

public class Mobile extends LandLinePhone {
    String type = "Mobile phone";
    /**
     * Method hiding
     * we are hiding use() static method
     * so we can not override
     */
    public static  void use(){
        System.out.println(ANSI_YELLOW + "USE METHOD MOBILE: Using Mobile phone" + ANSI_RESET);
    }

    public void text(){
        use();
        System.out.println(ANSI_PURPLE + "And sending text message" + ANSI_RESET);
    }
}
