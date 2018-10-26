package HW2610.HW4Task1;

public class Figure {
    public static void main(String[] args) {
        Circle circle = new Circle(1,1,3,3);
        circle.getArea(circle);
        circle.getPerimetr(circle);

        Triangle triangle = new Triangle(1,1,3,6,5,3);
        triangle.getPerimetr(triangle);
        triangle.getArea(triangle);

        Rectangle rectangle = new Rectangle(1,1,6,1,6,5,1,5);
        rectangle.getPerimetr(rectangle);
        rectangle.getArea(rectangle);

    }
}
