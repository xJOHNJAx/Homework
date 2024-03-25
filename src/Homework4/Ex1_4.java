package Homework4;

public class Ex1_4 {

    public static void main(String[] args) {
        String numberStr = "012312";

        long number1 = Long.parseLong(numberStr);
        System.out.println("Способ 1: " + number1);

        Long number2 = Long.valueOf(numberStr);
        System.out.println("Способ 2: " + number2);

        Long number3 = new java.math.BigInteger(numberStr).longValue();
        System.out.println("Способ 3: " + number3);
    }
}

