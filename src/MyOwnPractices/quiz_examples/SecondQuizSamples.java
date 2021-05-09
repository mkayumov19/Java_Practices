package MyOwnPractices.quiz_examples;

public class SecondQuizSamples {
    public static void main(String[] args) {
//
//        int x = 10;
//        int y = x++;
//        System.out.println(y++ + " " + x++ + " " + y);
        boolean x = true;
        boolean y = !x == false;
        boolean z = y;
        if (x) {
            System.out.println("1");
        }if(y){
            System.out.println("2");
        }if(z){
            System.out.println("3");
        }

        int num = 9;
        if (num++ == 10){
            System.out.println("Hello world"+num);
        }else {
            System.out.println("hello universe"+num);
        }

        int number = 10;
        if (--number > 10){
            System.out.println("Hello cybertek"+number);
        }else{
            System.out.println("Hello world"+number);
        }
        int score = 0;
        if (score == 0){
            score += 50;
        }if (score != 0) {
            score += 50;
        }
        System.out.println(score);

        int number1 =10;
        if (number1 % 2 == 0){
            System.out.println(number1 + " is even");
        }else{
            System.out.println(number1 + " is odd");

        }

    }
}
