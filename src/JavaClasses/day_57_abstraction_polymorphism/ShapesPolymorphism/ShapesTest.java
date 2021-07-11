package JavaClasses.day_57_abstraction_polymorphism.ShapesPolymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapesTest {
    public static void main(String[] args) {
        Shape triangle = new Triangle();
        triangle.draw();

        Shape circle = new Circle();
        circle.draw();

        Shape square = new Square();
        square.draw();

        List<Shape> shape = new ArrayList<>();
        shape.add(triangle);
        shape.add(new Square());
        shape.add(new Triangle());
        shape.add(new Square());
        shape.add(new Circle());
        shape.add(new Triangle());
        shape.add(new Square());
        shape.add(new Circle());
        shape.add(new Triangle());

        for (Shape eachShape : shape) {
            eachShape.draw();
        }
        drawShape(new Circle());
        drawShape(new Square());
        drawShape(new Triangle());
    }

    //static method:
    public static void drawShape(Shape shape){
        System.out.println("----Drawing shape");
        shape.draw();
    }

}
