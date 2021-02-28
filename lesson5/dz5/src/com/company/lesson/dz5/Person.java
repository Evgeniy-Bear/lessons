package com.company.lesson.dz5;

public class Person {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Person() {
        setFIO("undefined");
        setPosition("undefined");
        setEmail("undefined");
        setPhone("undefined");
        setSalary(0);
        setAge(0);

    }

    public Person(String fio, String position, String email, String phone, int salary, int are) {
        setFIO(fio);
        setPosition(position);
        setEmail(email);
        setPhone(phone);
        setSalary(salary);
        setAge(are);

    }

    public void printPerson() {
        System.out.print("Ф.И.О: " + getFIO() + ", ");
        System.out.print("Должность: " + getPosition() + ", ");
        System.out.print("E-mail: " + getEmail() + ", ");
        System.out.print("телефон: " + getPhone() + ", ");
        if (getSalary() > 0) {
            System.out.print("Зарплата: " + getSalary() + ", ");
        }

        if (getAge() > 0) {
            System.out.print("Возраст: " + getAge() + ", ");
        }
        System.out.println();
    }


    public String getFIO() {
        return fio;
    }

    public void setFIO(String fio) {
        this.fio = fio;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
