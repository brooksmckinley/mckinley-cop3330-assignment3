/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex42;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<String> records = FileIO.getRecords(ExerciseConstants.INPUT_FILENAME);
        CSV csv = new CSV(records);
        System.out.print(csv.getTableReport());
    }
}
