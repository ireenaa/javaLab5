package ua.lviv.iot.algo.part1.lab5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsDeleter {
    public static final int LENGHT = 2;
    public static Pattern pattern = Pattern.compile("\\b(?=\\w*[aeiouy]{2})\\w{" + LENGHT
            + ",}\\b", Pattern.CASE_INSENSITIVE);

    public WordsDeleter(String text) {
    }

    public String removeWords(String text, int length) {
        if (text.isEmpty()) {
            throw new IllegalArgumentException("You don`t enter a text");
        }
        Matcher matcher = pattern.matcher(text);
        String res = matcher.replaceAll("");
        System.out.println("Fixed text is: " + res);
        return res;
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a text ");
            return;
        }
        String text = args[0];
        WordsDeleter deleter = new WordsDeleter(text);
        String cleanedText = deleter.removeWords("IoT - Internet of things", LENGHT);
        System.out.println("Cleaned text: ");
        System.out.println(cleanedText);
    }
}

