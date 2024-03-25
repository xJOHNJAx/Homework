package Homework4;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2_1 {
    public static void main(String[] args) {
        String text = "Мой номер телефона +375-29-1234567, Мой ник в Телеграм @TheGodFather.";
        Pattern phonePattern = Pattern.compile("\\d{7}");
        Pattern nickPattern = Pattern.compile("@(\\w+)");

        Matcher phoneMatcher = phonePattern.matcher(text);
        Matcher nickMatcher = nickPattern.matcher(text);

        if (phoneMatcher.find()) {
            System.out.println("Номер телефона без кода: " + phoneMatcher.group());
        }

        if (nickMatcher.find()) {
            System.out.println("Ник в Телеграм: " + nickMatcher.group(1));
        }
    }
}