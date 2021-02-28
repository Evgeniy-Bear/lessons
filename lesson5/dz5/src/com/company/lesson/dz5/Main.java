package com.company.lesson.dz5;

public class Main {
    public static void main(String[] args) {
        Person[] persArray=new Person[5];
        persArray[0]=new Person("Иванов Иван Иванович","технолог","inanov@mail.ru","+79129220001",50000,36);
        persArray[1]=new Person("Петров Сергей Иванович","пекарь","petrov@mail.ru","+79129220002",20000,48);
        persArray[2]=new Person("Сидоров Василий Петрович","менеджер","sidorov@mail.ru","+79129220003",30000,41);
        persArray[3]=new Person("Орлов Эдуард Васильевич","кладовщик","orlov@mail.ru","+79129220004",25000,55);
        persArray[4]=new Person("Соколов Михаил Эдуардович","водитель","sokolov@mail.ru","+79129220005",31000,31);
        for (int i = 0; i < persArray.length; i++) {
           if(persArray[i].getAge()>40) persArray[i].printPerson();

        }
    }
}
