package com.geekbrains;

public class TestArray {

    public int testArray(String arr[][]) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        int a=0;
        if (arr.length != 4) throw new MyArraySizeException("не корректная размерность массива");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
               try {sum = sum + Integer.parseInt(arr[i][j]);

               } catch (NumberFormatException e) {
                   throw new MyArrayDataException(i,j);
               }


            }
        }
        return sum;

    }


}
