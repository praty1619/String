import java.util.*;

public class TextProcessingApp {
    public static void main(String[] args) {
        String text = "Hello Good People , This Program is a test Program so so Cheers..!";

        // Counting characters, words, and lines
        System.out.println("Number of characters: " + countCharacters(text));
        System.out.println("Number of words: " + countWords(text));
        System.out.println("Number of lines: " + countLines(text));

        // Reversing the text
        System.out.println("Reversed text: " + reverseText(text));

        // Converting the text to uppercase
        System.out.println("Uppercase text: " + toUpperCase(text));

        // Removing duplicate words
        System.out.println("Text with duplicate words removed: " + removeDuplicates(text));
    }

    // Method to count characters in the text
    private static int countCharacters(String text) {
        return text.length();
    }

    // Method to count words in the text
    private static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    // Method to count lines in the text
    private static int countLines(String text) {
        String[] lines = text.split("\r\n|\r|\n");
        return lines.length;
    }

    // Method to reverse the text
    private static String reverseText(String text) {
        StringBuilder reversed = new StringBuilder(text);
        return reversed.reverse().toString();
    }

    // Method to convert the text to uppercase
    private static String toUpperCase(String text) {
        return text.toUpperCase();
    }

    // Method to remove duplicate words from the text
    private static String removeDuplicates(String text) {
        String[] words = text.split("\\s+");
        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));
        return String.join(" ", uniqueWords);
    }
}
