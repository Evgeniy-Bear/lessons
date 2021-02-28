package com.company;

public class Box <T extends Number>{ //extends это ограничение типа сверху Number ром
    private T [] arr;

    public Box(T... arr) {
        this.arr = arr;
    }
    public double getAverage(){
      double average=0.0;
        for (int i = 0; i < arr.length; i++) {
            average+=arr[i].doubleValue();

        }
        return average/arr.length;
    }
    public boolean compare(Box<?> otherBox){// ? мета символьный оргумент
        return Math.abs(getAverage()-otherBox.getAverage())<0.01;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }
}
