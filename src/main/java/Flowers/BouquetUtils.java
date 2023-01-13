package Flowers;

import javax.swing.*;

public class BouquetUtils {
    public static void main(String[] args) {
        final Tulip hollandTulip = new Tulip("Holland", 30);
        final Rose japanRose = new Rose("Japan", 40);
        final Flower[] bouquet = new Flower[]{hollandTulip, japanRose};
        int sum = hollandTulip.getPrice() + japanRose.getPrice();
        System.out.println("Цена за букет: " + priceofBouquet(bouquet));
        System.out.println("Всего продали цветов: " + Flower.counter);
    }

    private static int priceofBouquet(Flower[] bouquet) {

        int sum = 0;
        for (int i = 0; i < bouquet.length; i++) {
            sum = sum + bouquet[i].getPrice();
        }
        return sum;
    }
}
