package Homework1;

public class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInfo() {
        System.out.println("Animal: " + name + ", Age: " + age);
    }
}

