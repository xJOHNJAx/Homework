package Homework4;

public class Ex1_1 {
    public static void main(String[] args) {
        final String part1 = "Мама";
        final String part2 = " мыла ";
        final String part3 = "раму";

        String stringLiteral = "Мама мыла раму";
        String stringConcatenation = part1 + part2 + part3;

        System.out.println(stringLiteral == stringConcatenation);
    }
}


