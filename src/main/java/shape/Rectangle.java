package shape;

public class Rectangle implements Shape {
    double length;
    double wide;

    public Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    @Override
    public double area() {
        return length * wide;
    }
}