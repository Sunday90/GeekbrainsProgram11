package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();

        for (int i=0;i<10;i++) {
            appleBox1.addFruit(new Apple());
            appleBox2.addFruit(new Apple());
            orangeBox1.addFruit(new Orange());
        }

        System.out.printf("В первом ящике с яблоками %d яблок, во втором ящике с яблоками %d яблок, " +
                "в ящике с апельсинами %d апельсинов", appleBox1.getFruitCount(), appleBox2.getFruitCount(), orangeBox1.getFruitCount());

        appleBox1.empty(appleBox2);

        System.out.printf("\nТеперь в первом ящике с яблоками %d яблок, во втором ящике с яблоками %d яблок, " +
                "в ящике с апельсинами %d апельсинов", appleBox1.getFruitCount(), appleBox2.getFruitCount(), orangeBox1.getFruitCount());

        String equals = appleBox2.compare(orangeBox1) ? "равны" : "не равны";

        System.out.printf("\nВес второго ящика с яблоками %f, вес ящика с апельсинами %f", appleBox2.getWeight(), orangeBox1.getWeight());

        System.out.printf("\nВеса %s", equals);
    }

}
