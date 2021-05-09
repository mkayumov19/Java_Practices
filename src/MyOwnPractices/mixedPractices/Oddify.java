package MyOwnPractices.mixedPractices;

public class Oddify {
    public static void main(String[] args) {
        int num1 = 3, num2 = 4, num3 = 12, num4 = 7;

        if (num1 % 2 != 0){
            num1+=1;
            System.out.println(num1);
        } else {
            System.out.println(num1);
        } if (num2 % 2 != 0){
            num2+=1;
            System.out.println(num2);
        } else {
            System.out.println(num2);
        } if (num3 % 2 != 0){
            num3+=1;
            System.out.println(num3);
        }else{
            System.out.println(num3);
        }if (num4 % 2 != 0){
            num4+=1;
            System.out.println(num4);
        }else{
            System.out.println(num4);
        }
    }
}