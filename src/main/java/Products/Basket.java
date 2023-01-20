package Products;

import Robot.Main;

import java.util.Arrays;

public class Basket {
    private int maxSize;
    private Product[] products;
    private int currentSize = 0;

    public Basket(int size) {
        this.products = new Product[size];
        this.maxSize = size;
    }

    public boolean addProduct(Product product) {
        if (maxSize > currentSize) {
            products[currentSize] = product;
            currentSize++;
            return true;
        }
        return false;
    }

    public double totalSalePrice() {
        double totalPrice = 0;
        for (int i=0; i < products.length; i++){
            if (products[i] != null) {
                totalPrice += products[i].getSalePrice();
            }
        }
        return totalPrice;
    }

    public int getCurrentSize() {
        return currentSize;
    }
    public void printProducts() {
        if (currentSize == 0) {
            System.out.println("The basket is empty");
        }
        else {
            System.out.println("products=" + Arrays.toString(products));
        }
    }

    @Override
    public String toString() {
        return "Basket{" +
                "product=" + Arrays.toString(products) +
                '}';
    }


    public static void main(String[] args) {
        Basket basket = new Basket(0);
        Book book = new Book("Пушкин", "Евгений Онегин", 1825, 1000);
        Book book1 = new Book("Достоевский", "Преступление и наказание", 1870, 1500);
        ChildrenBook childrenBook = new ChildrenBook("Чуковский", "Тараканище", 1925, 800);
        TV tv = new TV("Sumsung", 45, 50000);
        Product[] product = new Product[]{book, book1, childrenBook};
        basket.addProduct(book);
        basket.addProduct(book1);
        basket.addProduct(tv);
        basket.addProduct(childrenBook);
        System.out.println(basket);
        System.out.println(basket.totalSalePrice());
        System.out.println(basket.getCurrentSize());
        basket.printProducts();
    }
}