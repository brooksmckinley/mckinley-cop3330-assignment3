package ex46;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestWordCounter {
    @Test
    public void testWordsReport() {
        WordCounter counter = new WordCounter();
        counter.countWords("word word word");
        Assertions.assertEquals("""
                word: ***
                """, counter.getWordsReport());
        counter = new WordCounter();
        Assertions.assertTrue(counter.getWordsReport().isBlank());
        counter.countWords("oneword");
        Assertions.assertEquals("""
                oneword: *
                """, counter.getWordsReport());
    }

    @Test
    public void testCountWords() {
        WordCounter counter = new WordCounter();
        // Test removal of blank space
        counter.countWords("""
                badger badger badger
                
                
                
                badger mushroom
                
                mushroom snake badger badger
                badger
                """);
        Assertions.assertEquals("""
                badger:   *******
                mushroom: **
                snake:    *
                """, counter.getWordsReport());
        counter.countWords("another badger");
        Assertions.assertEquals("""
                badger:   ********
                mushroom: **
                another:  *
                snake:    *
                """, counter.getWordsReport());
    }
}
