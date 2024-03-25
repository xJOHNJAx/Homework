package Homework4;

import java.io.*;
import java.util.Scanner;

public class Ex2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово для поиска:");
        String wordToFind = scanner.nextLine();
        scanner.close();

        String filePath = "C:\\Users\\xJOHNJAx\\Downloads\\Война и мир.txt";
        String content = readFile(filePath);
        if (content == null) {
            System.out.println("Не удалось прочитать файл.");
            return;
        }

        TextSearcher simpleSearcher = new SimpleSearcher();
        TextSearcher regexSearcher = new RegexSearcher();

        int simpleCount = simpleSearcher.search(content, wordToFind);
        int regexCount = regexSearcher.search(content, wordToFind);

        System.out.println("Слово \"" + wordToFind + "\" найдено " + simpleCount + " раз(а) с помощью обычного поиска.");
        System.out.println("Слово \"" + wordToFind + "\" найдено " + regexCount + " раз(а) с помощью регулярных выражений.");
    }

    private static String readFile(String filePath) {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append(System.lineSeparator());
            }
            return contentBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}