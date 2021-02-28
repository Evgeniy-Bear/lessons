package com.company.lesson5.animals;

public class Cat {

    private String name;
    private String color = "Черный";
    private int are;




    public Cat(String name1, int are) {
        this.name = name1;
        setAre(are);
        init();
    }

    public Cat(String name1, String color, int are) {
        this.name = name1;
        this.color = color;
        setAre(are);

        init();

    }

    private void init() {


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAre() {
        return are;
    }

    public void setAre(int are) {
        if (are>0 && are<50){
        this.are = are;}
        else {
            System.out.println("Введено не верное значение ");
        }
    }

    public void meow() {
        System.out.println("мяу");
    }
}
