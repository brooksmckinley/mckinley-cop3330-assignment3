/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex41;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> names = FileIO.getRecords(ExerciseConstants.INPUT_FILENAME);
        ListOperator operator = new ListOperator(names);
        operator.sortList();
        // FileNotFound is a fatal error here, since there would be nowhere to write to.
        FileIO.writeOutput(ExerciseConstants.OUTPUT_FILENAME, operator.getListReport());
    }
}
