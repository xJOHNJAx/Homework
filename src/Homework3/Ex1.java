package Homework3;

import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        int[] array = new int[1_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = 1_000_000 + i;
        }
        Random random = new Random();
        int randomInt = random.nextInt(1_000_000, 2_000_000);
        int index = binarySearch(array, randomInt);
        if (index != -1) {
            System.out.println("Элемент найден на индексе: " + index);
        } else {
            System.out.println("Элемент не найден.");
        }
    }

    public static int binarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                return mid;
            } else if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
