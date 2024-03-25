package Homework4;

import java.util.Scanner;

public class Ex1_3 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final StringBuilder sb = new StringBuilder();
        String inputLine;

        System.out.println("Введите строки. Для завершения введите 'стоп'.");
        while (!(inputLine = scanner.nextLine()).equalsIgnoreCase("стоп")) {
            sb.append(inputLine).append(" ");
        }
        scanner.close();
        System.out.println("Результат: " + sb.toString().trim());
    }
}

