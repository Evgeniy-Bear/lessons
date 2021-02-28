package com.company;

public class Main {
    private static final float appleWeight = 1.0f;
    private static final float orangeWeight = 1.5f;

    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        appleBox.addFruit(new Apple(appleWeight));
        appleBox.addFruit(new Apple(appleWeight));
        orangeBox.addFruit(new Orange(orangeWeight));
        orangeBox.addFruit(new Orange(orangeWeight));
        appleBox.addFruit(new Apple(appleWeight));

        System.out.println(orangeBox.compare(appleBox));
        appleBox.clearBox();

    }

}
