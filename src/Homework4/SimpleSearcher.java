package Homework4;
public class SimpleSearcher implements TextSearcher {
    @Override
    public int search(String text, String wordToFind) {
        int count = 0;
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (word.equalsIgnoreCase(wordToFind)) {
                count++;
            }
        }
        return count;
    }
}