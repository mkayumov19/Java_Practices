package JavaBasics.day_37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("First sum returns: " + sum(10, 15));
        System.out.println("Second sum returns: " + sum(10.5, 38.4));
        System.out.println("Third sum returns: " + sum(25, 15, 50));
        System.out.println("Fourth sum returns: " + sum("Cybertek", "Ziyotek"));

        MethodOverloading.num(10,8);
        num(10.4,12.4);
        num((int)10.5,8,45);

    }
    public static int sum(int num1, int num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
    public static double sum(double num1, double num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
    public static int sum(int num1, int num2, int num3){
        if(num1 > num2 && num1 > num3){
            return num1;
        }else{
            return num2;
        }
    }
    public static String sum(String num1, String num2){
        if(num1.length() > num2.length()){
            return num1;
        }else{
            return num2;
        }
    }
//==================================================================================================================================
    public static void num(int num1, int num2) {
        System.out.println("sum(int , int )");
        System.out.println("Result = " + (num1 + num2));
    }

    public static void num(int num1, int num2, int num3) {
        System.out.println("sum(int , int , int )");
        System.out.println("Result = " + (num1 + num2 + num3));
    }

    public static void num(double num1, double num2) {
        System.out.println("sum(double, double)");
        System.out.println("Result = " + (num1 + num2));
    }

    public static void num(String str1, String str2) {
        System.out.println("sum(string, string)");
        System.out.println("Result = " + (str1 + str2));
    }

}
