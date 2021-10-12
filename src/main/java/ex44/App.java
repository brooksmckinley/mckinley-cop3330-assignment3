/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex44;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            Inventory inventory = new Inventory(Files.readString(Path.of(ExerciseConstants.INPUT_FILENAME)));
            PromptInput prompter = new PromptInput(new Scanner(System.in));
            while (true) {
                String search = prompter.promptLine("What is the product name? ");
                System.out.print(inventory.getProductReport(search));
                if (inventory.productExists(search)) {
                    // Break loop after successfully finding a product.
                    break;
                }
            }
        } catch (IOException ioException) {
            System.err.println("File unable to be read! Please create " + ExerciseConstants.INPUT_FILENAME + " and try again.");
        }
    }
}
