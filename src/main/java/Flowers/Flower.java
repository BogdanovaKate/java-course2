package Flowers;

public class Flower {
    private final String country;
    private final int price;
    static int counter = 0;

    public Flower(String country, int price) {
        this.country = country;
        this.price = price;
        Flower.counter++;
    }

    public int getPrice() {
        return price;
    }
}
