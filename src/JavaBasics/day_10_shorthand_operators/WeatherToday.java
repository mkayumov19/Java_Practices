package JavaBasics.day_10_shorthand_operators;
import java.util.Scanner;
    public class WeatherToday {
        public static void main(String[] args) {
//          String weather, sunny, rainy, veryCold, cold;
            Scanner scan = new Scanner(System.in);

            System.out.println("How is weather today in your city?");
            String weather = scan.nextLine();
            System.out.println("I like "+weather+" weather.");


        }
}
