/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex46;

public class Word {
    private final String word;
    private int count;

    public Word(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public void incrementCount() {
        this.count++;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }
}
