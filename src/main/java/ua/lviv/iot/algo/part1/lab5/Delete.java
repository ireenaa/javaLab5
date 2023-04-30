package ua.lviv.iot.algo.part1.lab5;

import java.util.Scanner;

public class Delete {
    public static final int LENGHT = 2;

    public static void main(String[] args) {

        System.out.println("Enter a text: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        WordsDeleter deleter = new WordsDeleter();
        deleter.removeWords(text, LENGHT);
    }
}

