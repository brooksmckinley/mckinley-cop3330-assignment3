/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex42;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestCSV {
    @Test
    public void testConstructor() {
        ArrayList<String> testList = new ArrayList<>(Arrays.asList(
                "Test,Name,30",
                "Another,Name,000",
                "Something,else,here"));
        CSV testCSV = new CSV(testList);
        String[][] expected = new String[][]{
                new String[]{"Test", "Name", "30"},
                new String[]{"Another", "Name", "000"},
                new String[]{"Something", "else", "here"}
        };
        Assertions.assertEquals(expected.length, testCSV.table.length);
        for (int i = 0; i < testCSV.table.length; i++) {
            Assertions.assertArrayEquals(expected[i], testCSV.table[i]);
        }
    }

    @Test
    public void testTableReport() {
        ArrayList<String> testList = new ArrayList<>(Arrays.asList(
                "Test,Name,30",
                "Another,Name,000",
                "Something,else,here"));
        CSV testCSV = new CSV(testList);
        Assertions.assertEquals("""
                Last      First     Salary
                --------------------------
                Test      Name      30
                Another   Name      000
                Something else      here
                """,
                testCSV.getTableReport()
        );
    }

    @Test
    public void testSampleCase() {
        ArrayList<String> testList = new ArrayList<>(Arrays.asList(
                "Ling,Mai,55900",
                "Johnson,Jim,56500",
                "Jones,Aaron,46000",
                "Jones,Chris,34500",
                "Swift,Geoffrey,14200",
                "Xiong,Fong,65000",
                "Zarnecki,Sabrina,51500"));
        CSV testCSV = new CSV(testList);
        Assertions.assertEquals("""
                Last      First     Salary
                --------------------------
                Ling      Mai       55900
                Johnson   Jim       56500
                Jones     Aaron     46000
                Jones     Chris     34500
                Swift     Geoffrey  14200
                Xiong     Fong      65000
                Zarnecki  Sabrina   51500
                """,
                testCSV.getTableReport());
    }
}
