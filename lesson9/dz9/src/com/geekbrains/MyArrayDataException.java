package com.geekbrains;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int i, int j) {
        super("не верные данные лежат в ячейке (" + i + ", " + j + ")");

    }


}
