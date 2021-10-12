/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */


package ex45;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        // Read in data and initialize prompter
        PromptInput prompter = new PromptInput(new Scanner(System.in));
        ArrayList<String> lines = FileIO.getRecords(ExerciseConstants.INPUT_FILENAME);

        // Prompt for filename
        String outputFilename = prompter.promptLine("What should the output filename be? ");

        // Initialize replacer and perform replacement
        LineReplacer replacer = new LineReplacer(lines);
        replacer.replace("utilize", "use");

        // Write out result
        FileIO.writeOutput(outputFilename, replacer.getOutput());
    }
}
