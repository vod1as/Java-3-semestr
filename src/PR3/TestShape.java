package PR3;

import java.lang.*;

public class TestShape {

    public static void main(String[] args) {

        Shape circle = new Circle(3, "Red", false);
        System.out.println(circle);

        Shape rectangle = new Rectangle(7, 4, "Red", true);
        System.out.println(rectangle);

        Shape square = new Square(11, "Red", true);
        System.out.println(square);
    }
}