/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex43;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PromptInput prompter = new PromptInput(new Scanner(System.in));
        String name = prompter.promptLine("Site name: ");
        String author = prompter.promptLine("Author: ");
        boolean js = prompter.promptYesNo("Do you want a folder for JavaScript? ");
        boolean css = prompter.promptYesNo("Do you want a folder for CSS? ");
        Website site = new Website(name, author, js, css);
        System.out.print(site.generateWebsiteTree());
    }
}
