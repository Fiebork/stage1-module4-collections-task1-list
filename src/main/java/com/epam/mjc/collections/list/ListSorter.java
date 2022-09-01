package com.epam.mjc.collections.list;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
        for (int i = 0; i < sourceList.size() - 1; i++) {
            if (Math.abs(Integer.parseInt(sourceList.get(i))) == Math.abs(Integer.parseInt(sourceList.get(i + 1)))
            && Integer.parseInt(sourceList.get(i)) > Integer.parseInt(sourceList.get(i + 1))) {
                String t = sourceList.get(i);
                sourceList.set(i, sourceList.get(i + 1));
                sourceList.set(i + 1, t);
            }
        }
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return (int) (5 * Math.pow(Integer.parseInt(a), 2) - 3 - 5 * Math.pow(Integer.parseInt(b), 2) + 3);
    }
}
