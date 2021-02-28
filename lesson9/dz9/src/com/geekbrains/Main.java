package com.geekbrains;


public class Main {
    public static void main(String[] args) {
        int n = 4;
        TestArray test = new TestArray();
        String[][] array = new String[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = Integer.toString(i + j);
            }
        }
        // array[3][1] = "B";
        try {
            System.out.println("Сумма элементов массива: " + test.testArray(array));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException ex) {
            ex.printStackTrace();
        }


    }
}
