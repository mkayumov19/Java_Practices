package myOwnPractices.mixedPractices;
import java.util.Scanner;
    public class InputSeconds {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter seconds:");

//          FORMULA MAKING:
//          3600 seconds = 1 hour
//          3600 seconds = 60 minutes
//          60 seconds = 1 minute
//      --->3700 seconds = 1 hour, 1 minute and 40 seconds
//          hour    : 3700 / 3600 = 1 hour, 100 seconds remaining
//          minute  : 100 / 60 = 1 minute, 40 seconds remaining
//          seconds : remaining seconds from minute calculation, 40 seconds remaining

            int inputSeconds, hours, minutes,seconds;
            inputSeconds = scan.nextInt();
            hours = inputSeconds / 3600;                            //hour    : 3700 / 3600 = 1 hour, 100 seconds remaining
            int remainingSecondsAfterHour = inputSeconds % 3600;    //creat extra var to catch remaining values
            minutes = remainingSecondsAfterHour / 60;               //minute  : 100 / 60 = 1 minute, 40 seconds remaining
            seconds = remainingSecondsAfterHour % 60;               //seconds : remaining seconds from minute calculation

//            minutes = (inputSeconds % 3600) / 60;         ---> shorter way
//            seconds = (inputSeconds % 3600) % 60;         ---> shorter way
            System.out.print(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");

        }
}