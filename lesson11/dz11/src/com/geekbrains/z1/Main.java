package com.geekbrains.z1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] a = {"1", "2", "3"};
        change(a, 0, 2);
        System.out.println(a[0] + " " + a[2]);
        System.out.println(arrToArraysList(a));

    }

    public static void change(Object[] arr, int in1, int in2) {
        if (in1 >= 0 && in1 <= arr.length & in2 >= 0 && in2 <= arr.length & in1 != in2) {
            Object ch = arr[in1];
            arr[in1] = arr[in2];
            arr[in2] = ch;
        }
    }

    public static <T> ArrayList<T> arrToArraysList(T[] arr) {
        ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(arr));
        return arrayList;
    }

}
