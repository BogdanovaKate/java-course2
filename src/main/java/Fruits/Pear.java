package Fruits;

public class Pear extends Fruit {
    static double coeff = 0.3;
    public Pear(double weight) {
        super(weight);
    }

    @Override
    public double getPrice() {
        return (weight * coeff);
    }
}
