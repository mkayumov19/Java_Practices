package JavaBasics.day_24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) throws InterruptedException {
        int num = 5;
        boolean code;
        while(num > 0){
            code = true;
            System.out.println(num + " larger than 0 \uD83D\uDC34" + code);
            num--;

            Thread.sleep(600);
        }
        while(num > -5){
            code = false;
            System.out.println(num + " larger than 0 :" + code);
            num--;
        }Thread.sleep(500);
        System.out.println("Count has finished");
    }
}
