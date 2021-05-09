package JavaClasses.day_35_methods_with_param;

import java.util.Scanner;

public class MethodsWithParams {
    public static void main(String[] args) {
        displayValue(19);
        displayValue(10);
        method1("Max");


    }
    public static void displayValue(int num){
        System.out.println("Value is " + num);
    }
    public static void method1 (String name){
        System.out.println("-What's your name? \n-My name is "+name+".\n-Really?"+" my name is "+name+" too!");
    }

}
