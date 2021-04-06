package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayWrapper <T> {
    public T[] list;

    public ArrayWrapper(T[] list) {
        this.list = list;
    }

    public void changeArray() {
        try {
            T temp = list[1];
            list[1] = list[0];
            list[0] = temp;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public ArrayList<T> getArrayList() {
        return new ArrayList<>(Arrays.asList(list));
    }

}
