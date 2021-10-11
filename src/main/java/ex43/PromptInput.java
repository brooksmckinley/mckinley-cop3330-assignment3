/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex43;

import java.util.Scanner;

public class PromptInput {
    private Scanner scan;

    public PromptInput(Scanner scan) {
        this.scan = scan;
    }

    public String promptLine(String prompt, String regex) {
        while (true) {
            System.out.print(prompt);
            String line = this.scan.nextLine();
            if (line.matches(regex)) {
                return line;
            } else {
                System.out.println("Invalid input. Please try again.");
            }
        }
    }

    public String promptLine(String prompt) {
        return promptLine(prompt, ".*");
    }

    public boolean promptYesNo(String prompt) {
        String response = promptLine(prompt, "^[yYnN]$");
        return response.equalsIgnoreCase("y");
    }
}
