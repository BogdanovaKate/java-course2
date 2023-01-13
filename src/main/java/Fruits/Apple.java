package Fruits;

public class Apple extends Fruit{
    static double coeff = 0.2;
   public Apple(double weight) {
       super(weight);
   }
    @Override
    public double getPrice() {
        return (weight * coeff);
    }
}
