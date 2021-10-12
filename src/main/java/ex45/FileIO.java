/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex45;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO {
    public static ArrayList<String> getRecords(String inputFilename) {
        ArrayList<String> res = new ArrayList<>();

        // Open a scanner to read the specified input file.
        try (Scanner file = new Scanner(new File(inputFilename))) {
            while (file.hasNextLine()) {
                res.add(file.nextLine());
            }
        } catch (FileNotFoundException e) {
            // If the file doesn't exist, then there are no records. Return a blank array.
        }

        return res;
    }

    public static void writeOutput(String outputFilename, String output) throws FileNotFoundException {
        try (PrintStream writer = new PrintStream(outputFilename)) {
            writer.print(output);
        }
    }
}
