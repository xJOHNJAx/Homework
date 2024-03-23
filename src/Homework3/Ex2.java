package Homework3;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int[] array = new int[100_000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100_000); // Допустим, числа от 0 до 99999
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальный и конечный индексы, разделенные пробелом:");
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();
        for (int i = startIndex; i <= endIndex && i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}
