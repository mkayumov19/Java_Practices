package MyOwnPractices.quiz_examples;

public class ThirdQuizSamples {
    public static void main(String[] args) {

        float f1 = (12_435.1 > 123_45.0) ? 12_456 : 124_56.02f;
        float f2 = f1 + 1024;
        System.out.println(f2);

        int z = 11;
        switch(z){
            case 10:
                System.out.println("Monday");
            case 11:
                System.out.println("Tuesday");
            case 12:
                System.out.println("wednesday");
            default:
                System.out.println("friday");
        }

    }
}
