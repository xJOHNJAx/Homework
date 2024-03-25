package Homework2;

import java.util.Arrays;

abstract class Car {
    Engine engine;
    Wheel[] wheels;
    int seats;
    String drivingLicenseCategory;
    Key key;
    private boolean doorOpen;
    private boolean engineRunning;
    private boolean doorLocked;
    private String doorCode;
    public Car(String doorCode) {

        this.doorLocked = true;
        this.doorCode = doorCode;
    }

    public void unlockDoorWithKey(Key key) {
        if (key.getCode().equals(this.doorCode)) {
            System.out.println("Код ключа верный, дверь открыта.");
            this.doorLocked = false;
        } else {
            System.out.println("Код ключа неверный, дверь остается закрытой.");
        }
    }

    public boolean isDoorLocked() {
        return doorLocked;
    }

    public void setDoorLocked(boolean doorLocked) {
        this.doorLocked = doorLocked;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    public void setEngineRunning(boolean engineRunning) {
        this.engineRunning = engineRunning;
    }

    public Car(Engine engine, Wheel[] wheels, int seats, String drivingLicenseCategory, Key key) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.drivingLicenseCategory = drivingLicenseCategory;
        this.key = key;

    }

    public boolean unlock(Key key) {

        return false;
    }

    public abstract void start();

    public void drive() {
        System.out.println("Автомобиль в движении.");
    }

    public void takePassengers(int numberOfPassengers) {
        if (numberOfPassengers <= seats) {
            System.out.println("Пассажиры приняты. Всего пассажиров: " + numberOfPassengers);
        } else {
            System.out.println("Слишком много пассажиров!");
        }
    }

    public void refuel(String fuelType, double amount) {
        if (engine.getFuelType().equals(fuelType)) {
            System.out.println("Автомобиль заправлен " + amount + " литрами " + fuelType);
        } else {
            System.out.println("Неправильный тип топлива!");
        }
    }
}



