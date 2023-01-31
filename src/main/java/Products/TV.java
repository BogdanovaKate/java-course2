package Products;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TV tv = (TV) o;
        return screenSize == tv.screenSize && Objects.equals(brand, tv.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brand, screenSize);
    }
}
