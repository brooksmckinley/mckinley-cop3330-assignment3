/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex46;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestWord {
    @Test
    public void testIncrementWord() {
        Word newWord = new Word("new", 0);
        Assertions.assertEquals(0, newWord.getCount());
        newWord.incrementCount();
        Assertions.assertEquals(1, newWord.getCount());
        newWord.incrementCount();
        Assertions.assertEquals(2, newWord.getCount());
        newWord = new Word("otherword", 20);
        Assertions.assertEquals(20, newWord.getCount());
        newWord.incrementCount();
        Assertions.assertEquals(21, newWord.getCount());
    }
}
