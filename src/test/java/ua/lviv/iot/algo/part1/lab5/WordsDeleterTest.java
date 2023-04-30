package ua.lviv.iot.algo.part1.lab5;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
class WordsDeleterTest {
    public static final int LENGHT=2;
    WordsDeleter deleter = new WordsDeleter();
    private final String text = "IoT is not very hard";
    @Test
    public void removeWords() {
        assertEquals(" is not very hard", deleter.removeWords(text, 2));

    }
    @Test
    public void testIfStringIsEmpty() {
        String text = "";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            deleter.removeWords(text,LENGHT);
        });
    }
}

