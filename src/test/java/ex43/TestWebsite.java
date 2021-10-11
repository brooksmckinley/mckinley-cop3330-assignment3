/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex43;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestWebsite {
    @Test
    public void testConstructorAndGetters() {
        Website testWebsite = new Website("Some name", "Some author", true, false);
        Assertions.assertEquals("Some name", testWebsite.getName());
        Assertions.assertEquals("Some author", testWebsite.getAuthor());
        Assertions.assertTrue(testWebsite.getHasJS());
        Assertions.assertFalse(testWebsite.getHasCSS());
    }

    @Test
    public void testFilePaths() {
        Website testWebsite = new Website("name", "author", true, true);
        Assertions.assertEquals("./website/name", testWebsite.getRootDirectory());
        Assertions.assertEquals("./website/name/index.html", testWebsite.getIndexHTMLPath());
        Assertions.assertEquals("./website/name/js/", testWebsite.getJSDirectory());
        Assertions.assertEquals("./website/name/css/", testWebsite.getCSSDirectory());
    }

    @Test
    public void testHTMLGeneration() {
        Website testWebsite = new Website("name", "author", false, false);
        Assertions.assertEquals("""
                <!DOCTYPE html>
                <html>
                    <head>
                        <meta name="author" content="author">
                        <title>name</title>
                    </head>
                </html>
                """, testWebsite.getIndexHTML());
    }
}
