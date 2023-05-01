package ua.lviv.iot.algo.part1.lab5;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;
class WordsDeleterTest {
    public static final int LENGHT=2;
    WordsDeleter deleter = new WordsDeleter("IoT - Internet of things");
    private final String text = "IoT - Internet of things";
    @Test
    public void removeWords() {
        assertEquals(" - Internet of things", deleter.removeWords(text, 2));

    }
    @Test
    public void testIfStringIsEmpty() {
        String text = "";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            deleter.removeWords(text,LENGHT);
        });
    }
    @Test
    public void testOfstansCon() {
        String text = "rrr ";
        assertEquals("rrr", deleter.removeWords(text, 2));

    }
}

