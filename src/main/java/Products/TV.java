package Products;

public class TV extends Product {
    private final String brand;
    private final int screenSize;

    public TV(String brand, int screenSize, double regularPrice) {
        super(regularPrice);
        this.brand = brand;
        this.screenSize = screenSize;
    }

    @Override
    public double getSalePrice() {
        return getRegularPrice()*1.3;
    }

    @Override
    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
