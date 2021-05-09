package JavaClasses.day_15_logicalops_switch_ternary;

public class NoLogicaltOperator {
    public static void main(String[] args) {

//        !         ---> NOT operator. It takes boolean value and reverses it
//        !true     = not true/false
//        !false    = not false/true

        int apple = 5;
        System.out.println(!(apple > 2));        // false
        System.out.println(!(apple < 2));        // true

        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 8;
        if (!(age > 7)){
            System.out.println("Child should be buckled up in car seat if age = "+age);
        } else {
            System.out.println("Child don't need car seat if age = "+age);
        }
        boolean isSmokingAllowed = false;
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed in here");
        }
        boolean isAffordable = true;
        if (!isAffordable) {
            System.out.println("It is affordable");
        } else {
            System.out.println("It is not affordable.");
        }
        String carModel ="Camry";
        if (!carModel.equals("Tesla")){
            System.out.println("I am not interested in "+ carModel);
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!inputPassword.equals(secretPassword)){
            System.out.println("Password is wrong");
        }
        if (!secretPassword.equals(inputPassword)){
            System.out.println("Password is wrong 2nd time");
        }
        String day = "Daytime";
        day.equals(false);
        String night = "Night";
        night.equals(true);
        if (!day.equals(night)){
            System.out.println("It is night time because " +day+" is false");
        }
        int num =5, num1 = 10, num2 = 15;
//      When we use & (AND), it will check/evaluate BOTH sides of conditions no matter what:
//       false and true = false
//        5 > 10 & 15 > 4;

        if(num > num1 & num2 < num1){
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        }
    }
}









