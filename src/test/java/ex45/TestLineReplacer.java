/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */


package ex45;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TestLineReplacer {

    @Test
    public void testGetOutput() {
        LineReplacer test = new LineReplacer(Arrays.asList("Line1", "Line2", "Line3"));
        Assertions.assertEquals("""
                Line1
                Line2
                Line3
                """, test.getOutput());
        test = new LineReplacer(List.of("This is only one line"));
        Assertions.assertEquals("This is only one line\n", test.getOutput());
    }

    @Test
    public void testReplace() {
        LineReplacer useTest = new LineReplacer(Arrays.asList("""
                One should never utilize the word "utilize" in writing. Use "use" instead.
                For example, "She uses an IDE to write her Java programs" instead of "She
                utilizes an IDE to write her Java programs".
                """.split("\n")));
        useTest.replace("utilize", "use");
        Assertions.assertEquals("""
                        One should never use the word "use" in writing. Use "use" instead.
                        For example, "She uses an IDE to write her Java programs" instead of "She
                        uses an IDE to write her Java programs".
                        """, useTest.getOutput());
        LineReplacer anotherTest = new LineReplacer(Arrays.asList("""
                This is another test. I can write
                on multiple lines and it still works.
                                
                Someone help me! Every time I write "test"
                it comes out as HAHAHAHA!
                """.split("\n")));
        anotherTest.replace("test", "HAHAHAHA");
        Assertions.assertEquals("""
                This is another HAHAHAHA. I can write
                on multiple lines and it still works.
                                
                Someone help me! Every time I write "HAHAHAHA"
                it comes out as HAHAHAHA!
                """, anotherTest.getOutput());
    }
}
