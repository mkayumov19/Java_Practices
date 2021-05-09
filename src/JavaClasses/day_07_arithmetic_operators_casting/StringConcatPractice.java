package JavaClasses.day_07_arithmetic_operators_casting;

public class StringConcatPractice {
    public static void main(String[] args) {

        System.out.println("Java"+5+3);         //Java53    concatenation
        System.out.println("java"+(5+3));       //Java8     addition

        System.out.println(5+3+"Java");         //8Java     addition
        System.out.println(5+(3+"Java"));       //53Java    concatenation
        System.out.println("Java"+1+2+3);       //Java123   concatenation
        System.out.println("Java"+(1+2+3));     //Java6     addition

        String str1 = "Hello";
        String str2 = "Friends";
        System.out.println(str1+" "+str2);      //Hello Friends     concatenation

        int num1 = 7;
        int num2 = 8;
        System.out.println(num1 + num2);         //15  addition
        System.out.println(num1+" "+num2);       //7 8 concatenation   string has space value
        System.out.println(num1+""+num2);        //78  concatenation   string has empty value
        System.out.println(""+7+8);              //78  concatenation

        char char1 = 'a';
        char char2 = 'b';
        System.out.println(char1+char2);         //195 addition. Char values behind a,b letters added
        System.out.println(char1+""+char2);      //ab  concatenation. empty string value between
    }
}
