package ua.lviv.iot.algo.part1.lab5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordsDeleter {
    public static final int LENGHT = 2;
    public String removeWords(String text, int length) {
        if (text.isEmpty()) {
            throw new IllegalArgumentException("You don`t enter a text");
        }
        Pattern pattern = Pattern.compile("\\b(?=\\w*[aeiouy]{2})\\w{" + length + ",}\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        String res = matcher.replaceAll("");
        System.out.println("Fixed text is: " + res);

        return res;
    }
    public static void main(String[] args) {

        System.out.println("Enter a text: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        WordsDeleter deleter = new WordsDeleter();
        deleter.removeWords(text, LENGHT);
    }
}

