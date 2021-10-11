/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex43;

import java.io.File;
import java.io.FileNotFoundException;

public class Website {
    private final String name;
    private final String author;
    private final boolean hasJS;
    private final boolean hasCSS;

    public Website(String name, String author, boolean js, boolean css) {
        this.name = name;
        this.author = author;
        this.hasJS = js;
        this.hasCSS = css;

    }

    public String generateWebsiteTree() {
        StringBuilder report = new StringBuilder();

        // Create root directory
        boolean rootCreated = new File(getRootDirectory()).mkdirs();
        if (!rootCreated) {
            report.append(getRootDirectory()).append(" already exists!").append('\n');
        } else {
            report.append("Created ").append(getRootDirectory()).append('\n');
        }

        // Create index.html
        try {
            FileIO.writeOutput(getIndexHTMLPath(), getIndexHTML());
            report.append("Created ").append(getIndexHTMLPath()).append('\n');
        } catch (FileNotFoundException e) {
            report.append("Failed to create ").append(getIndexHTMLPath()).append('\n');
            e.printStackTrace();
        }

        // Create JS directory (if necessary)
        if (hasJS) {
            boolean jsCreated = new File(getJSDirectory()).mkdirs();
            if (!jsCreated) {
                report.append(getJSDirectory()).append(" already exists!").append('\n');
            } else {
                report.append("Created ").append(getJSDirectory()).append('\n');
            }
        }

        // Create CSS directory (if necessary)
        if (hasCSS) {
            boolean cssCreated = new File(getCSSDirectory()).mkdirs();
            if (!cssCreated) {
                report.append(getCSSDirectory()).append(" already exists!").append('\n');
            } else {
                report.append("Created ").append(getCSSDirectory()).append('\n');
            }
        }

        return report.toString();
    }

    public String getIndexHTML() {
        return String.format("""
                <!DOCTYPE html>
                <html>
                    <head>
                        <meta name="author" content="%s">
                        <title>%s</title>
                    </head>
                </html>
                """, author, name);
    }

    public String getIndexHTMLPath() {
        return getRootDirectory() + "/index.html";
    }

    public String getRootDirectory() {
        return "./website/" + name;
    }

    public String getCSSDirectory() {
        return getRootDirectory() + "/css/";
    }

    public String getJSDirectory() {
        return getRootDirectory() + "/js/";
    }


    // Getters
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getHasJS() {
        return hasJS;
    }

    public boolean getHasCSS() {
        return hasCSS;
    }
}
