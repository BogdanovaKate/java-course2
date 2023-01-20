package Products;

public abstract class Product {
    private final double regularPrice;

    public Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String toString() {
        return "Product{" +
                "regularPrice=" + regularPrice +
                '}';
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public abstract double getSalePrice();
}
