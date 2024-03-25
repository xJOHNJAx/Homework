package Homework1;

public class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void printInfo() {
        System.out.println("Car: " + model + ", Year: " + year);
    }
}

