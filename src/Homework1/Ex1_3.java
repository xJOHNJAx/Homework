package Homework1;

import java.util.Scanner;

public class Ex1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        String input = scanner.nextLine();
        int product = 1;
        System.out.println("Перемножение цифр числа " + input + ":");

        for (char digitChar : input.toCharArray()) {
            if (Character.isDigit(digitChar)) {
                int digit = Character.getNumericValue(digitChar);
                product *= digit;
                System.out.println("Текущая цифра: " + digit + ", промежуточный результат: " + product);
            }
        }
        System.out.println("Итоговое произведение цифр: " + product);
        scanner.close();
    }
}