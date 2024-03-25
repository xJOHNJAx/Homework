package Homework4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class RegexSearcher implements TextSearcher {
    @Override
    public int search(String text, String wordToFind) {
        int count = 0;
        Pattern pattern = Pattern.compile("\\b" + wordToFind + "\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}