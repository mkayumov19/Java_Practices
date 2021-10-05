package myOwnPractices.advancedTasks;
import java.util.Scanner;
public class PandemicChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a 4 digit year");
        int year = scan.nextInt();
        if (year >= 1346 && year <= 1353) {
            System.out.println(year + " was The Black Death pandemic year");
        } else if (year >= 1665 && year <= 1666) {
            System.out.println(year + " was Great Plague of London pandemic year");
        } else if (year >= 1770 && year <= 1772) {
            System.out.println(year + " was Russian Plague pandemic year");
        } else if (year >= 1889 && year <= 1890) {
            System.out.println(year + " was Flu pandemic year");
        } else if (year == 1916) {
            System.out.println(year + " was American polio epidemic year");
        } else if (year >= 1918 && year <= 1920) {
            System.out.println(year + " was Spanish Flu pandemic year");
        } else if (year >= 2009 && year <= 2010) {
            System.out.println(year + " was H1N1 Swine Flu pandemic year");
        } else if(year >= 2014 && year <= 2016){
            System.out.println(year + " was West African Ebola epidemic year");
        }else if(year >= 2020 && year <= 2021){
            System.out.println(year + " was COVID-19 pandemic year");
        }else{
            System.out.println("There was no pandemic in "+year);
        }
    }
}
