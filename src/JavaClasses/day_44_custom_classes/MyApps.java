package JavaClasses.day_44_custom_classes;

public class MyApps {
    public static void main(String[] args) {
//      String app1 = "uber";   This is String object. just characters
        App uberApp = new App();    //creating new object
        uberApp.open();         //call OPEN method using object variable
        uberApp.name = "UBER";
        uberApp.version = 2.5;
        uberApp.open();

    }

}
