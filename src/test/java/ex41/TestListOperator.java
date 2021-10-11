/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex41;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestListOperator {
    @Test
    public void testSortList() {
        ArrayList<String> testList = new ArrayList<>();
        testList.add("bbbb");
        testList.add("aaaa");
        testList.add("dddd");
        ListOperator operator = new ListOperator(testList);
        operator.sortList();
        operator.namesList;
    }
}
