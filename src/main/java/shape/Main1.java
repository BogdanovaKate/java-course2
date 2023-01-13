package shape;

public class Main1 {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        printArea(circle);
        Rectangle rectangle = new Rectangle(2, 3);
        printArea(rectangle);
        Square square = new Square(4);
        printArea(square);
    }

    public static void printArea(Shape shape) {
        System.out.println("Площадь фигуры = " + shape.area());
    }
}