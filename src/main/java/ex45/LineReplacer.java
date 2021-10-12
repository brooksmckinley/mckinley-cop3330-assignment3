/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */


package ex45;

import java.util.List;

public class LineReplacer {
    private final List<String> lines;

    public LineReplacer(List<String> lines) {
        this.lines = lines;
    }

    public void replace(String original, String replacement) {
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            String newLine = line.replaceAll(original, replacement);
            lines.set(i, newLine);
        }
    }

    public String getOutput() {
        StringBuilder res = new StringBuilder();
        for (String line : lines) {
            res.append(line).append('\n');
        }
        return res.toString();
    }
}
