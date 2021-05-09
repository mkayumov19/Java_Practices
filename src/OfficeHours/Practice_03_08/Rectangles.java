package OfficeHours.Practice_03_08;
import java.util.Scanner;                       // PIC  (Package-> Import -> Class
public class Rectangles {
    public static void main(String[] args) {
//        Calculate the Perimeter 2(l*w)
//        - Calculate the Area (w * l)
//        - Print properties of the Rectangle
//        - Modify to accept Scanner inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Perimeter and Area Calculator:\nEnter length: ");
//          double length = 5;                  ------> Hard coded length
            double length = input.nextDouble();
        System.out.println("Enter width: ");
            double width = input.nextDouble();
            double perimeter = 2 * (length + width);
            double area = length * width;
        System.out.println("Perimeter = "+ perimeter);
        System.out.println("Area = "+area);

    }
}
