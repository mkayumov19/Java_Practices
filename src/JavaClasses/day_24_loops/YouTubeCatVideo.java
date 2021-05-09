package JavaClasses.day_24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;
        while (seconds <= 17){
            System.out.println("Watching World's smallest cat \uD83D\uDC08- video,at second: "+seconds);
            seconds++;
            Thread.sleep(500);
        }
        System.out.println("Finished watching World's smallest cat \uD83D\uDC08- video.");

    }
}
