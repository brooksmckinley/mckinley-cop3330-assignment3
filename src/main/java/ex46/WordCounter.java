/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex46;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class WordCounter {
    private final HashMap<String, Word> words;
    private int longestWord = 0;

    public WordCounter() {
        words = new HashMap<>();
    }

    public void countWords(String text) {
        // Split by newlines, then by whitespace to get each word
        for (String line : text.trim().split("\n")) {
            for (String word : line.split(" ")) {
                String lowerWord = word.trim().toLowerCase(Locale.ROOT);

                // Skip if the word is blank
                if (word.isBlank()) {
                    continue;
                }

                // If the word exists in the array, increment it. Otherwise add it to the map.
                if (words.containsKey(lowerWord)) {
                    words.get(lowerWord).incrementCount();
                } else {
                    words.put(lowerWord, new Word(lowerWord, 1));
                    longestWord = Math.max(lowerWord.length(), longestWord);
                }
            }
        }
    }

    public String getWordsReport() {
        StringBuilder res = new StringBuilder();

        // Convert map to a list
        ArrayList<Word> wordsList = new ArrayList<>(words.values());

        // Compare in descending order
        wordsList.sort((word1, word2) -> word2.getCount() - word1.getCount());
        for (Word word : wordsList) {
            res.append(word.getWord())
                    .append(":")
                    // Pad with spaces as necessary. The length before the asterisks should be the longest word plus one
                    // for an additional space.
                    .append(" ".repeat(Math.max(1, longestWord + 1 - word.getWord().length())))
                    .append("*".repeat(word.getCount()))
                    .append("\n");
        }

        return res.toString();
    }
}
