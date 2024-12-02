package org.example;

import java.util.*;

public class RemoveDuplicates {
    public List<Integer> removeDuplicatesFromSortedList(List<Integer> sortedList) {
        if (sortedList == null || sortedList.isEmpty()) {
            return sortedList;
        }

        Set<Integer> uniqueSet = new HashSet<>(sortedList);
        return new ArrayList<>(uniqueSet);
    }
}
