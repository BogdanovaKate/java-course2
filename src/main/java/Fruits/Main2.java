package Fruits;

import Flowers.Flower;

import java.time.Period;

public class Main2 {
    public static void main(String[] args) {
        final Apple apple1 = new Apple(0.33);
        final Apple apple2 = new Apple(0.75);
        final Pear pear = new Pear(0.25);
        final Fruit[] fruits = new Fruit[]{apple1, apple2, pear};
        final Fruit[] apples = new Fruit[]{apple1, apple2};
        final Fruit[] pears = new Fruit[]{pear};
        System.out.println("Общая стоимость фруктов: " + getTotalPrice(fruits));
        System.out.println("Стоимость яблок: " + getApplePrice(apples));
        System.out.println("Стоимость груш: " + getPearPrice(pears));
    }

    public static double getTotalPrice(Fruit[] fruits) {
        double sum = 0;
        for (int i = 0; i < fruits.length; i++) {
            sum = sum + fruits[i].getPrice();
        }
        return sum;
    }

    public static double getApplePrice(Fruit[] apples) {
        double sum = 0;
        for (int i = 0; i < apples.length; i++) {
            sum = sum + apples[i].getPrice();
        }
        return sum;
    }

    public static double getPearPrice(Fruit[] pears) {
        double sum = 0;
        for (int i = 0; i < pears.length; i++) {
            sum = sum + pears[i].getPrice();
        }
        return sum;
    }
}