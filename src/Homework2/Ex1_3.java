package Homework2;

public class Ex1_3 {
    public static void main(String[] args) {
        Key key1 = new Key("key123");
        Key key2 = new Key("key456");
        Driver driver = new Driver(10, new String[]{"B", "C"}, new Key[]{key1});
        Car car = new SedanCar(new GasolineEngine(2.0, "95", "EcoBoost"),
                new Wheel[]{new SummerWheel(18, "Pirelli P Zero"),
                        new SummerWheel(18, "Pirelli P Zero"),
                        new SummerWheel(18, "Pirelli P Zero"),
                        new SummerWheel(18, "Pirelli P Zero")},
                5, "B", key1);
        if (car instanceof SedanCar) {
            ((SedanCar) car).printCarInfo();
        }

        driver.operateCar(car, key1);
        driver.driveCar(car);
        driver.takePassengers(car, 4);
        driver.refuelCar(car, "95", 50);

    }
}

