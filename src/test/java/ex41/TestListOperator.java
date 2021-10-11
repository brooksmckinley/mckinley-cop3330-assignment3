/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex41;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListOperator {
    @Test
    public void testSortList() {
        ArrayList<String> testList = new ArrayList<>();
        testList.add("bbbb");
        testList.add("aaaa");
        testList.add("dddd");
        ListOperator operator = new ListOperator(testList);
        operator.sortList();
        Assertions.assertEquals("""
                Total of 3 names
                -----------------
                aaaa
                bbbb
                dddd
                """,
                operator.getListReport());
    }

    @Test
    public void testGetListReport() {
        ArrayList<String> testList = new ArrayList<>();
        testList.add("bbbb");
        testList.add("aaaa");
        testList.add("dddd");
        ListOperator operator = new ListOperator(testList);
        Assertions.assertEquals("""
                Total of 3 names
                -----------------
                bbbb
                aaaa
                dddd
                """,
                operator.getListReport());
    }

    @Test
    public void testSampleCase() {
        ArrayList<String> testList = new ArrayList<>(Arrays.asList("""
                Ling, Mai
                Johnson, Jim
                Zarnecki, Sabrina
                Jones, Chris
                Jones, Aaron
                Swift, Geoffrey
                Xiong, Fong
                """.split("\n")));
        ListOperator operator = new ListOperator(testList);
        Assertions.assertEquals(
                """
                        Total of 7 names
                        -----------------
                        Ling, Mai
                        Johnson, Jim
                        Zarnecki, Sabrina
                        Jones, Chris
                        Jones, Aaron
                        Swift, Geoffrey
                        Xiong, Fong
                        """,
                operator.getListReport()
        );
        operator.sortList();
        Assertions.assertEquals(
                """
                        Total of 7 names
                        -----------------
                        Johnson, Jim
                        Jones, Aaron
                        Jones, Chris
                        Ling, Mai
                        Swift, Geoffrey
                        Xiong, Fong
                        Zarnecki, Sabrina
                        """,
                operator.getListReport()
        );
    }
}
