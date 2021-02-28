package com.company;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruitList;

    private float totalWeight;

    public Box() {
        this.fruitList = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruitList.add(fruit);
        totalWeight = fruitList.size() * fruit.getWeight();
    }

    public float getWeight() {
        return totalWeight;
    }

    public boolean compare(Box box) {

        return Math.abs(totalWeight - box.getWeight()) < 0.01;

    }

    public void clearBox() {
        List<T> copy = List.copyOf(fruitList);
        fruitList.clear();
        totalWeight = fruitList.size() * getWeight();

    }

}
