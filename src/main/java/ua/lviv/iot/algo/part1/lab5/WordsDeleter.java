package ua.lviv.iot.algo.part1.lab5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class WordsDeleter {
    public String removeWords(String text, int length) {
        if (text.isEmpty()) {
            throw new IllegalArgumentException("You don`t enter a text");
        }
        Pattern pattern = Pattern.compile("\\b(?=\\w*[aeiouy]{2})\\w{" + length + ",}\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        String res = matcher.replaceAll("");
        System.out.println("Our fixed text is: "+res);

        return res;
    }
}

