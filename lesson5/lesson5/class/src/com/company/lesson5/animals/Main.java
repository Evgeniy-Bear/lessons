package com.company.lesson5.animals;

import com.company.lesson5.animals.Cat;

public class Main {
    public static void main(String[] args) {


        Cat cat = new Cat("Снеж", 100);
        Cat cat2 = new Cat("Mih", "ghby", 100);
        Cat[] cats=new Cat[5];
        cats[0]=new Cat("Барсик",1);
        cats[1]=new Cat("Васька",2);
        cats[2]=new Cat("джамба",3);
        cats[3]=new Cat("мотроскин",4);
        cats[0].setAre(123);
        System.out.println(cats[2].getName());

    }
}