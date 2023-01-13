package shape;

public class Square implements Shape {
    double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return length * length;

    }
}

