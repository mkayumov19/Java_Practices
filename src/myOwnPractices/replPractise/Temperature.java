package myOwnPractices.replPractise;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };
        double totaltemp = 0;
        double averageTemp = 0;
        for(int i =0; i < temps.length; i++){
            totaltemp +=temps[i];
        }
        averageTemp = totaltemp/ temps.length;
        System.out.println(averageTemp);
    }
}
