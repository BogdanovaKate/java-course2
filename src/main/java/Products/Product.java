package Products;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.regularPrice, regularPrice) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(regularPrice);
    }
}
