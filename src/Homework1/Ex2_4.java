package Homework1;

public class Ex2_4 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Animal("Dog", 5),
                new Animal("Cat", 3)
        };

        Car[] cars = {
                new Car("Toyota", 2020),
                new Car("Honda", 2018)
        };

        for (Animal animal : animals) {
            animal.printInfo();
        }

        for (Car car : cars) {
            car.printInfo();
        }
    }
}
