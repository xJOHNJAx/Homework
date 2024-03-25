package Homework2;

public class Ex1_2 {
    public static void main(String[] args) {
        Car car = new Car("12345") {
            @Override
            public void start() {

            }
        };
        Key key = new Key("12345");

        car.unlockDoorWithKey(key);

        if (!car.isDoorLocked()) {
            System.out.println("Дверь автомобиля успешно открыта.");
        } else {
            System.out.println("Не удалось открыть дверь автомобиля.");
        }
    }
}