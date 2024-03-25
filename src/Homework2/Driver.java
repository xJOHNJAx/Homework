package Homework2;

public class Driver {
    private int drivingExperience;
    private String[] licenseCategories;
    private Key[] keys;

    public Driver(int drivingExperience, String[] licenseCategories, Key[] keys) {
        this.drivingExperience = drivingExperience;
        this.licenseCategories = licenseCategories;
        this.keys = keys;
    }

    public void openCar(Car car, Key key) {
        car.unlock(key);
    }

    public void startCar(Car car) {
        car.start();
    }

    public void operateCar(Car car, Key key) {
        if (car.unlock(key)
        ) {
            car.start();
        }
    }

    public void driveCar(Car car) {
        car.drive();
    }

    public void takePassengers(Car car, int numberOfPassengers) {
        car.takePassengers(numberOfPassengers);
    }

    public void refuelCar(Car car, String fuelType, double amount) {
        car.refuel(fuelType, amount);
    }
}



