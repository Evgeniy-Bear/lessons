package com.geekbrains;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook =  new PhoneBook();
        phoneBook.add("Ivanov","89999999999");
        phoneBook.add("Petrov","89999999998");
        phoneBook.add("Ivanov","89999999997");
        phoneBook.add("Petrov","89999999996");
        phoneBook.add("Petrov","89999999995");
        phoneBook.add("Sokolov","89999999994");
        phoneBook.add("Orlov","89999999993");
        phoneBook.add("Ivanov","89999999992");
        phoneBook.add("Ivanov","89999999991");
        phoneBook.add("Ivanov","89999999990");

        System.out.println(phoneBook.get("Ivanov"));
    }
}
