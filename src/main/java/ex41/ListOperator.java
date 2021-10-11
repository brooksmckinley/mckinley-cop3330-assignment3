/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Brooks McKinley
 */

package ex41;

import java.util.List;

public class ListOperator {
    private List<String> namesList;

    public ListOperator(List<String> namesList) {
        this.namesList = namesList;
    }

    public void sortList() {
        this.namesList.sort(null);
    }
}
