package ru.geekbrains;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Box <T extends Fruit> {
    ArrayList<T> list = new ArrayList<>();

    public float getWeight () {
       // 1. Объясните плиз как суммировать через потоки элементы float в коллекции
       // list.stream().collect(Collectors.summingDouble(Double::doubleValue));


        //2. Еще один вопрос - у меня в классе Fruit есть свойство weight. В наследниках Fruit тоже есть это свойство
        //Но когда я обращаюсь к weight в коде:
        //return list.size()*list.get(0).weight;
        //почему-то не происходит обращение к реализации этого свойства в конкретном наследнике,
        //а обращение идет к базовому классу Fruit.
        //В данном случае не работает полиморфизм?

        float weight;
        if (list.get(0) instanceof Apple) {
            weight = ((Apple)list.get(0)).weight;
        }
        else
        {
            weight = ((Orange)list.get(0)).weight;
        }

        return list.size()*weight;

    }



    public void addFruit(T fruit) {
        list.add(fruit);
    }

    public boolean compare (Box b) {
        return this.getWeight() == b.getWeight();
    }


    public void empty (Box<T> b) {
        this.list.forEach(fruit ->
        {
            b.addFruit(fruit);
        });
        list.clear();
    }

    public int getFruitCount () {
        return list.size();
    }
}
