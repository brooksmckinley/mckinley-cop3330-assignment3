/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex44;

import java.util.Scanner;

public class PromptInput {
    private final Scanner scan;

    public PromptInput(Scanner scan) {
        this.scan = scan;
    }

    public String promptLine(String prompt) {
        System.out.print(prompt);
        return this.scan.nextLine();
    }

}
