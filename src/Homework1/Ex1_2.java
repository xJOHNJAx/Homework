package Homework1;

import java.util.Scanner;

public class Ex1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        long product = 1;

        for (int i = 1; i <= number; i++) {
            product *= i;
        }

        System.out.println("Произведение чисел от 1 до " + number + " равно " + product);
        scanner.close();
    }
}

