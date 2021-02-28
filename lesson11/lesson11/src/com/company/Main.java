package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Box<Integer> box1 = new Box<>(1,2,3,4);
//        Box<Double> box2 = new Box<>(1.0,3.0,4.0,5.0);
//
//        box1.compare(box2);

        // System.out.println(addTowTypes(1.0f,2.9f));

        List<Integer> list = new ArrayList<>();
        printElement(list);
    }

    //    private static <T extends Number> double addTowTypes(T str1, T str2) {
//        double res = str1.doubleValue() + str2.doubleValue();
//        return res;
//    }
//    private static <T> T printElement(List<T> listType) {
//        return listType.get(0);
//    }
    private static void printElement(List<? super Number> listType) {
        // listType.add(0);
  }

}
