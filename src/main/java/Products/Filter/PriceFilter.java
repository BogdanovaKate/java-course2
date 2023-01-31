package Products.Filter;

import Products.Product;

public class PriceFilter implements ProductFilter {
    double minPrice;
    double maxPrice;

    public PriceFilter(double minPrice, double maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    @Override
    public Product[] filter(Product[] products) {
        Product[] products1 = new Product[products.length];
        int j = 0;
        for (int i = 0; i<products.length; i++) {
            if (products[i] != null) {
                if (products[i].getRegularPrice() > minPrice && products[i].getRegularPrice() < maxPrice) {
                    products1[j] = products[i];
                    j++;
                }
            }
        }
        Product[] products2 = new Product[j];
        for (int i = 0; i<j; i++) {
            if (products1[i] != null) {
                products2[i] = products1[i];
            }
        }
        return products2;
    }
}
