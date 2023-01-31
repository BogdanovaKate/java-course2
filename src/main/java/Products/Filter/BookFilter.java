package Products.Filter;

import Products.Book;
import Products.Product;

public class BookFilter implements ProductFilter {
    @Override
    public Product[] filter(Product[] products) {
        Product[] products1 = new Product[products.length];
        int j = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] instanceof Book) {
                products1[j] = products[i];
                j++;
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
