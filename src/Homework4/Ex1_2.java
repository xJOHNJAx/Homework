package Homework4;

public class Ex1_2 {
    public static void main(String[] args) {
        final String phrase = "Я ЛЮБЛЮ ПИВО";
        final char[] characters = phrase.toCharArray();
        for (final char character : characters) {
            System.out.println(character);
        }
    }
}