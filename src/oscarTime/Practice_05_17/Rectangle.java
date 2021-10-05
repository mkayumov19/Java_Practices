package oscarTime.Practice_05_17;

public class Rectangle {
        double height;
        double width;
        double area;

    public void setDimensions(double recHeight, double recWidth) {
            height = recHeight;
            width = recWidth;
        }

    public double getArea(){
            area = height * width;
            return area;
    }

}
