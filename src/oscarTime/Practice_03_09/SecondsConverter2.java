package oscarTime.Practice_03_09;
import java.util.Scanner;
public class SecondsConverter2 {
    public static void main(String[] args) {

        int inputSeconds, hours, minutes, seconds;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        inputSeconds = scan.nextInt();			// 3695

		/*
			How many seconds in an hour?
			60 seconds = 1 minute
			60 minutes = 1 hour
			60 * 60 = 3600 seconds in an hour
		*/

        hours = inputSeconds / 3600;			// 3695 / 3600 = 1
        inputSeconds %=  3600;					//same as inputSeconds = inputSeconds % 3600
        minutes = inputSeconds / 60;			// 95 / 60 = 1
        inputSeconds %= 60;					// 35
        seconds = inputSeconds;

        System.out.println("hours: "+hours+", minutes: "+ minutes+", seconds: "+seconds);


    }

}



