package Homework2;

class SedanCar extends Car {
    public SedanCar(Engine engine, Wheel[] wheels, int seats, String drivingLicenseCategory, Key key) {
        super(engine, wheels, seats, drivingLicenseCategory, key);
    }
    public void printCarInfo() {
        System.out.println("SedanCar Information:");
// Вывод информации о двигателе
        System.out.println("Motor: " + this.engine.toString());
// Вывод информации о колесах
        System.out.println("Wheels:");
        for (Wheel wheel : this.wheels) {
            System.out.println(" - " + wheel.toString());
        }
// Вывод информации о количестве мест
        System.out.println("Seats: " + this.seats);
// Вывод информации о категории водительских прав
        System.out.println("Driving License Category: " + this.drivingLicenseCategory);
    }


    @Override
    public boolean unlock(Key key) {
        if (this.key.equals(key)) {
            System.out.println("Двери седана открыты.");
        }
        return false;
    }

    @Override
    public void start() {
        System.out.println("Седан заведен и готов к движению.");
    }
}